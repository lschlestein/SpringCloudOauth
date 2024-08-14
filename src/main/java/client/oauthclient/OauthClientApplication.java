package client.oauthclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.Map;

@SpringBootApplication
public class OauthClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(OauthClientApplication.class, args);
    }
}
