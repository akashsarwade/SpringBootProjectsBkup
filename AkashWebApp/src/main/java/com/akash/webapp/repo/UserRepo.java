package com.akash.webapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akash.webapp.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
