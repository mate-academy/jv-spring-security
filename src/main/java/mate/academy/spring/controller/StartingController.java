package mate.academy.spring.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class StartingController {
    @GetMapping
    public String startMessage(Authentication authentication) {
        return "Hello " + authentication.getName() + " !";
    }
}
