package com.example.com.microServiceProject.Repo;

import com.example.com.microServiceProject.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
}
