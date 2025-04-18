package s.gear.designPatterns;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import s.gear.designPatterns.menu.MenuController;

@SpringBootApplication
public class DesignPatternsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignPatternsApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(MenuController menuController) {
        return args -> {
            menuController.start();
        };
    }

}