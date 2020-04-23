package com.dev.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.entity.UserCreds;

public interface UserRepo extends JpaRepository<UserCreds, Long> {

	public UserCreds findByUserName(String userName);

}
