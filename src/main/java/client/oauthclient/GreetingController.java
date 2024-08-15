package client.oauthclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.Map;

@RestController
public class GreetingController {
    @GetMapping("/hello")
    public Map<String, String> hello(Principal principal) {
        return Map.of("message", principal.toString());
    }
}

