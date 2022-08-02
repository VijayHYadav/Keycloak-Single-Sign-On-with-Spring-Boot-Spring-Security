package com.vizz.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(org.springframework.security.config.annotation.web.builders.HttpSecurity http) throws java.lang.Exception {
        http.authorizeRequests().antMatchers("/", "/login").permitAll()
        .antMatchers("/home").authenticated()
        .and().csrf().disable()
        .formLogin().loginPage("/login")
        .defaultSuccessUrl("/home")
        .usernameParameter("username")
        .passwordParameter("password");
    }
    
}
