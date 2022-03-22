package com.trey.resourceserver.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

/**
 * @author turui
 */
public class MyResourceServerConfig extends ResourceServerConfigurerAdapter {
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.formLogin()
                .loginPage("/authentication/require")
                .loginProcessingUrl("/authentication/form")
                .and()
                .authorizeHttpRequests()
                .antMatchers("/user/**")
                .authenticated()
                .antMatchers("/oauth/token").permitAll()
                .anyRequest().permitAll()
                .and()
                .csrf().disable();
    }
}
