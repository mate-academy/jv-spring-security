package mate.academy.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class WebSecurityInitializer extends AbstractSecurityWebApplicationInitializer {
    @Bean
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { SecurityConfig.class };
    }
}
