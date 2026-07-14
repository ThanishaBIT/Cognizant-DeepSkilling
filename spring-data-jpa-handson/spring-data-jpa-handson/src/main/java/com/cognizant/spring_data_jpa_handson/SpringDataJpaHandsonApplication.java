package com.cognizant.spring_data_jpa_handson;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.spring_data_jpa_handson.entity.Student;
import com.cognizant.spring_data_jpa_handson.repository.StudentRepository;

@SpringBootApplication
public class SpringDataJpaHandsonApplication
        implements CommandLineRunner {

    private final StudentRepository studentRepository;

    public SpringDataJpaHandsonApplication(
            StudentRepository studentRepository) {

        this.studentRepository = studentRepository;
    }

    public static void main(String[] args) {

        SpringApplication.run(
                SpringDataJpaHandsonApplication.class,
                args);
    }

    @Override
    public void run(String... args) {

        Student student =
                new Student(
                        "Thanisha",
                        "thanisha29@gmail.com");

        studentRepository.save(student);

        System.out.println(
                "Student saved successfully");
    }
}