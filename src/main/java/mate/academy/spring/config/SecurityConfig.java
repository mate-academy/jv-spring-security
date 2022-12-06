package mate.academy.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import java.util.Properties;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
        @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
            auth.userDetailsService(inMemoryUserDetailsManager());
    }

        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http.authorizeRequests().
                    anyRequest().authenticated()
                    .and()
                    .formLogin()
                    .permitAll()
                    .and()
                    .httpBasic()
                    .and()
                    .csrf().disable();
        }


    @Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsManager() {
        Properties users = new Properties();
        users.put("max@i.ua", getEncoder().encode("qwer") + ",ROLE_USER,enabled");
        users.put("dan@i.ua", getEncoder().encode("qwerty") + ",ROLE_USER,enabled");
        return new InMemoryUserDetailsManager(users);
    }


    @Bean
    public PasswordEncoder getEncoder() {
        return new BCryptPasswordEncoder();
    }
}
