package com.cognizant.jpa_hibernate_springdata_difference;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.jpa_hibernate_springdata_difference.entity.Student;
import com.cognizant.jpa_hibernate_springdata_difference.repository.StudentRepository;
import com.cognizant.jpa_hibernate_springdata_difference.service.JpaStudentService;

@SpringBootApplication
public class JpaHibernateSpringdataDifferenceApplication
        implements CommandLineRunner {

    private final JpaStudentService jpaStudentService;
    private final StudentRepository studentRepository;

    public JpaHibernateSpringdataDifferenceApplication(
            JpaStudentService jpaStudentService,
            StudentRepository studentRepository) {

        this.jpaStudentService = jpaStudentService;
        this.studentRepository = studentRepository;
    }

    public static void main(String[] args) {

        SpringApplication.run(
                JpaHibernateSpringdataDifferenceApplication.class,
                args);
    }

    @Override
    public void run(String... args) {

        // JPA APPROACH
        Student student1 =
                new Student(
                        "Dharshini",
                        "dharshini28@gmail.com");

        jpaStudentService.saveStudent(student1);

        // SPRING DATA JPA APPROACH
        Student student2 =
                new Student(
                        "Ravi",
                        "ravi@gmail.com");

        studentRepository.save(student2);

        System.out.println(
                "Student saved using Spring Data JPA");
    }
}