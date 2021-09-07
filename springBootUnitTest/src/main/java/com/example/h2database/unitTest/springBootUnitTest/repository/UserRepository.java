package com.example.h2database.unitTest.springBootUnitTest.repository;

import com.example.h2database.unitTest.springBootUnitTest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
