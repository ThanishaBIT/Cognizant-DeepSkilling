package com.cognizant.jpa_hibernate_springdata_difference.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.jpa_hibernate_springdata_difference.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Service
public class JpaStudentService {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void saveStudent(Student student) {

        entityManager.persist(student);

        System.out.println(
                "Student saved using JPA EntityManager");
    }
}