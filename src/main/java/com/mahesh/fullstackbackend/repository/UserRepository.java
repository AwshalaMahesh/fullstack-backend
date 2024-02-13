package com.mahesh.fullstackbackend.repository;

import com.mahesh.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
