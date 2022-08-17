package se.yrgo.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Oscar",
                        "oscar@hotmail.com",
                        LocalDate.of(1994, Month.SEPTEMBER, 30),
                        28
                ),
                new Student(
                        2L,
                        "David",
                        "david@hotmail.com",
                        LocalDate.of(1993, Month.FEBRUARY, 11),
                        29
                )
        );
    }
}
