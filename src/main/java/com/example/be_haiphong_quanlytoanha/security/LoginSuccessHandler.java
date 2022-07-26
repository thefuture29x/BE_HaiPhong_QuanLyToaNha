package com.example.be_haiphong_quanlytoanha.security;

import com.example.be_haiphong_quanlytoanha.entity.UserEntity;
import com.example.be_haiphong_quanlytoanha.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@Component
public class LoginSuccessHandler implements AuthenticationSuccessHandler {
    @Autowired
    IUserRepository iUserRepository;
    private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        List<SimpleGrantedAuthority> roleEntities = (List<SimpleGrantedAuthority>) authentication.getAuthorities();

        String username = request.getParameter("username");
        UserEntity userEntity = iUserRepository.findByUsername(username);
        HttpSession session = request.getSession();
        if (session.getAttribute("userLogin") == null){
            session.setAttribute("userLogin",userEntity);
        }

        request.setAttribute("userLogin", userEntity);
        for (SimpleGrantedAuthority simple : roleEntities) {
            if (simple.getAuthority().contains("ROLE_ADMIN")) {
                redirectStrategy.sendRedirect(request, response, "/admin/office/find-all");
                return;
            }
        }
        for (SimpleGrantedAuthority simple : roleEntities) {
            if (simple.getAuthority().contains("ROLE_USER")) {
                redirectStrategy.sendRedirect(request, response, "/user/office/find-all");
                return;
            }
        }
    }
}
