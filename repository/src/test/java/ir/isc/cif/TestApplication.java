package ir.isc.cif;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TestApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(TestApplication.class, args);
    }
}
