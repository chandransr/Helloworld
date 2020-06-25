package guru.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
public class SpringBootWebApplication {
    public static void main(String[] argument) {
        SpringApplication.run(SpringBootWebApplication.class, argument);
    }
}
