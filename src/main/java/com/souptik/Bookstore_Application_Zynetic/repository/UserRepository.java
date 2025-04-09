package com.souptik.Bookstore_Application_Zynetic.repository;

import com.souptik.Bookstore_Application_Zynetic.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Users, Long> {
    Optional<Users> findByUsername(String username);
}
