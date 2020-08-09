package com.bepoc.BestEstimate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

//@EnableWebSecurity
@Configuration
//@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    MyUserDetailsService userDetailsService;

   // @Autowired
   // DataSource dataSource;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(getPasswordEncoder());
        /*auth.jdbcAuthentication()
                .dataSource(dataSource)
                .usersByUsernameQuery("select username, password, active from User where username = ?")
                .authoritiesByUsernameQuery("select username, roles from User where username = ?"); */

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.cors();
       // http.csrf().disable().authorizeRequests().antMatchers(HttpMethod.OPTIONS, "/**")
        http.csrf().disable().authorizeRequests()
                 .antMatchers("/be/phc", "/be/volAod", "/be/dhrtbr").hasRole("ADMIN")
                 .antMatchers(HttpMethod.OPTIONS, "/**").hasRole("USER")
                 .anyRequest().authenticated().and().httpBasic();

    }

    @Bean
    public PasswordEncoder getPasswordEncoder () {
        return NoOpPasswordEncoder.getInstance();
    }

}
