package ar.com.xeven.webservicespring;

import ch.qos.logback.core.net.server.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@SpringBootApplication
public class WebServiceSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebServiceSpringApplication.class, args);
    }

}
