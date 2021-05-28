package ar.com.xeven.webservicespring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class WebServiceSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebServiceSpringApplication.class, args);
    }

    @GetMapping
    public List<String> saludos(){
        return List.of("hola","chau","buenas tardes", "buenos días", "buenas noches");
    }

    @GetMapping(path="prueba")
    public List<ClienteEntity> clientes(){
        return List.of(
                new ClienteEntity(1, "juliana", "cto","faststart","202020","mail@fs.com"),
                new ClienteEntity(2, "pablo","ciso","ada","202020201","mail@ada.com")
        );
    }

}
