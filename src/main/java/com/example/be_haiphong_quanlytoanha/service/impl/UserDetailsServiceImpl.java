package com.example.be_haiphong_quanlytoanha.service.impl;

import com.example.be_haiphong_quanlytoanha.entity.UserEntity;
import com.example.be_haiphong_quanlytoanha.repository.IUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    IUserRepository iUserRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity = iUserRepository.findByUsername(username);
        if (username == null){
            throw new UsernameNotFoundException("User not found !");
        }
        UserDetailsImpl userDetails = new UserDetailsImpl(userEntity);
        return userDetails;
    }
}
