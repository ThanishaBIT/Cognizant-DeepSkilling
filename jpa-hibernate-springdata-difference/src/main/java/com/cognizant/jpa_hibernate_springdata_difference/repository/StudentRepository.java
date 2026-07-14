package com.cognizant.jpa_hibernate_springdata_difference.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.jpa_hibernate_springdata_difference.entity.Student;

public interface StudentRepository
        extends JpaRepository<Student, Integer> {

}