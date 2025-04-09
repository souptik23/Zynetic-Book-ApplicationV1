package com.souptik.Bookstore_Application_Zynetic.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.souptik.Bookstore_Application_Zynetic.model.Users;

import java.util.Optional;

public interface UserRepository extends MongoRepository<Users, Long> {
    Optional<Users> findByUsername(String username);
}
