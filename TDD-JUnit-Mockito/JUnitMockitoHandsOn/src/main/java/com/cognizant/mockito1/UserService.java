package com.cognizant.mockito1;

public class UserService {

    private UserRepository repository;

    // Constructor Injection
    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    // Business Method
    public String getUser() {
        return repository.getUserName();
    }
}