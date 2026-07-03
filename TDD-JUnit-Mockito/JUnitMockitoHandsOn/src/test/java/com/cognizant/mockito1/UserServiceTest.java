package com.cognizant.mockito1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class UserServiceTest {

    @Test
    void testGetUser() {

        // Create Mock Object
        UserRepository repository = mock(UserRepository.class);

        // Stubbing
        when(repository.getUserName()).thenReturn("Thanisha");

        // Inject Mock into Service
        UserService service = new UserService(repository);

        // Call Method
        String result = service.getUser();

        // Assertion
        assertEquals("Thanisha", result);
    }
}