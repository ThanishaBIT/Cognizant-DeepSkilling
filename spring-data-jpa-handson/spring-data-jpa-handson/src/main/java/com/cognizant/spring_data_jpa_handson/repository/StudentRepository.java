package com.cognizant.spring_data_jpa_handson.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.spring_data_jpa_handson.entity.Student;

public interface StudentRepository
        extends JpaRepository<Student, Integer> {

}