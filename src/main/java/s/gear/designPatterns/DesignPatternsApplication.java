// DesignPatternsApplication.java
package s.gear.designPatterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class DesignPatternsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignPatternsApplication.class, args);
    }

    @Bean
    public CommandLineRunner mainRunner() {
        return args -> {
            System.out.println("====================================");
            System.out.println("       DESIGN PATTERNS DEMO         ");
            System.out.println("====================================");
        };
    }
}

