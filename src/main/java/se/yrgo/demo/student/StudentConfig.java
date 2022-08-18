package se.yrgo.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student oscar = new Student(
                    "Oscar",
                    "oscar.nor@hotmail.com",
                    LocalDate.of(1994, SEPTEMBER, 30),
                    28
            );
            Student david = new Student(
                    "David",
                    "david.urm@hotmail.com",
                    LocalDate.of(1993, FEBRUARY, 11),
                    29
            );

            repository.saveAll(
                    List.of(oscar, david)
            );
        };
    }
}
