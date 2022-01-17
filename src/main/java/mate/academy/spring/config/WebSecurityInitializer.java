package mate.academy.spring.config;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

@EnableWebSecurity
public class WebSecurityInitializer extends AbstractSecurityWebApplicationInitializer {
}
