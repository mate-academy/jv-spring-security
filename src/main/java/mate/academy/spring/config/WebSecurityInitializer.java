package mate.academy.spring.config;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class WebSecurityInitializer extends AbstractSecurityWebApplicationInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{AppConfig.class, SecurityConfig.class};
    }
}
