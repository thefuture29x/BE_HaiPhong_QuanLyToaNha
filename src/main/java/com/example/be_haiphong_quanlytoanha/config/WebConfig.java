package com.example.be_haiphong_quanlytoanha.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.nio.file.Path;
import java.nio.file.Paths;


@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        Path pathDir = Paths.get("./src/main/resources/static");
        String filePath = pathDir.toFile().getAbsolutePath();

        registry.addResourceHandler("/css/**").addResourceLocations("file://" +filePath+"/css/");
        registry.addResourceHandler("/js/**").addResourceLocations("file://" +filePath+"/js/");
        registry.addResourceHandler("/assets/**").addResourceLocations("file://" +filePath+"/assets/");
        registry.addResourceHandler("/images/**").addResourceLocations("file://" +filePath+"/images/");
    }
}
