package mate.academy.spring.config;

import org.springframework.core.env.Environment;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    private final PasswordEncoder passwordEncoder;
    private final Environment environment;

    public SecurityConfig(PasswordEncoder passwordEncoder, Environment environment) {
        this.passwordEncoder = passwordEncoder;
        this.environment = environment;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder authManagerBuilder) throws Exception {
        authManagerBuilder.inMemoryAuthentication()
                .withUser(environment.getProperty("security.login"))
                .password(environment.getProperty("security.password"))
                .roles(environment.getProperty("security.role"));
    }

    public void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .authorizeRequests()
                .anyRequest().authenticated()
                .and().formLogin().permitAll()
                .and().httpBasic()
                .and().csrf().disable();
    }
}
