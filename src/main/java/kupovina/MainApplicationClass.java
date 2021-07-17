package kupovina;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "kupovina")
@SpringBootApplication
public class MainApplicationClass {
    public static void main(String[] args){
        SpringApplication.run(MainApplicationClass.class, args);
    }
}
