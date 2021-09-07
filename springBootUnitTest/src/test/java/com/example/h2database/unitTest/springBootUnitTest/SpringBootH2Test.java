package com.example.h2database.unitTest.springBootUnitTest;


import com.example.h2database.unitTest.springBootUnitTest.model.User;
import com.example.h2database.unitTest.springBootUnitTest.repository.UserRepository;
import com.example.h2database.unitTest.springBootUnitTest.util.UserType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.validation.constraints.AssertTrue;

import java.util.Date;

import static com.example.h2database.unitTest.springBootUnitTest.util.UserType.STUDENT;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class SpringBootH2Test {

    @Autowired
    private UserRepository userRepository;

    @Test
    @DisplayName("Create User Test")
    void createUserTest() {
        User created = userRepository.save(getUser());

        assertTrue(created != null);
    }

    private User getUser() {
        User user = new User();
        user.setUserType(UserType.STUDENT);
        user.setUserName("Philip");
        user.setPassword("1234");
        user.setDateofBirth(new Date());
        user.setCreationTime(new Date());

        return user;
    }
}
