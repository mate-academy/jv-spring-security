package mate.academy.spring.config;

import com.mysql.cj.protocol.AuthenticationProvider;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class WebSecurityInitializer extends AbstractSecurityWebApplicationInitializer {
    private AuthenticationProvider authenticationProvider;
}
