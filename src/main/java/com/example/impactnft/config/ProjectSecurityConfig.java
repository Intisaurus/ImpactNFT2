package com.example.impactnft.config;

import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;

//@Configuration
//public class ProjectSecurityConfig extends WebSecurityConfigurerAdapter {

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable()
//                .authorizeRequests()
//                .mvcMatchers("/").permitAll()
//                .and().formLogin().loginPage("/login")
//                .defaultSuccessUrl("/").failureUrl("/login?error=true").permitAll()
//                .and().logout().logoutSuccessUrl("/login?logout=true").invalidateHttpSession(true).permitAll()
//                .and().httpBasic();
//
//    }
    // method creates 2 users of different roles for test purposes
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
//        auth.inMemoryAuthentication()
//                .withUser("user").password("1234").roles("USER")
//                .and()
//                .withUser("admin").password("4321").roles("ADMIN")
//                .and().passwordEncoder(NoOpPasswordEncoder.getInstance());
//    }
//}
