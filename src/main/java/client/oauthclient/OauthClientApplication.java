package client.oauthclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;
import java.util.Map;

@SpringBootApplication
public class OauthClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(OauthClientApplication.class, args);
    }

    @Controller
    @ResponseBody
    class GreetingController {
        @GetMapping("/hello")
        public Map<String, String> hello(Principal principal) {
            return Map.of("message", "Hello" + principal.getName() + "!");
        }
    }
}
