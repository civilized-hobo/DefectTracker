package com.hithesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hithesh.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	public User findByUserNameAndPassword(@Param("userName") String userName, @Param("password") String password);
}
