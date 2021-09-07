package com.example.h2database.unitTest.springBootUnitTest;

import com.example.h2database.unitTest.springBootUnitTest.model.User;
import com.example.h2database.unitTest.springBootUnitTest.repository.UserRepository;
import com.example.h2database.unitTest.springBootUnitTest.util.UserType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.Date;

@SpringBootApplication
public class SpringBootUnitTestApplication {

	@Autowired
	private UserRepository userRepository;


	public static void main(String[] args) {
		SpringApplication.run(SpringBootUnitTestApplication.class, args);
	}

	@PostConstruct
	private void initDb() {
		User user = new User();
		user.setUserType(UserType.STUDENT);
		user.setUserName("PeterM");
		user.setPassword("ABC123abc*");
		user.setDateofBirth(new Date());
		user.setCreationTime(new Date());

		userRepository.save(user);
	}
}
