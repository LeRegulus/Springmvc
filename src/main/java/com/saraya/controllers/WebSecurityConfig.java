package com.saraya.controllers;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("regulusAlou").password("Saliou1946").roles("USER", "ADMIN");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().and().authorizeRequests().antMatchers("/home").permitAll();
//        http.csrf().and().authorizeRequests().antMatchers("/departments/**").access("hasAnyRole('ROLE_USER', 'ROLE_ADMIN')");
//        http.csrf().and().authorizeRequests().antMatchers("/employees/**").access("hasAnyRole('ROLE_USER', 'ROLE_ADMIN')");
//        http.csrf().and().authorizeRequests().and().formLogin();

        http.authorizeRequests().antMatchers("/home").permitAll()
                .antMatchers("/departments/**", "/employees/**").access("hasRole('USER')").and()
                .formLogin();
        http.csrf().disable();
    }
}
