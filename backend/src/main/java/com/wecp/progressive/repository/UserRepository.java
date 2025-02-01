package com.wecp.progressive.repository;

<<<<<<< HEAD

public interface UserRepository {
=======
import org.springframework.data.jpa.repository.JpaRepository;

import com.wecp.progressive.entity.User;

public interface UserRepository extends JpaRepository<User,Integer>{

    User findByUsername(String username);

    User findByEmail(String email);
>>>>>>> f48438c5f1295041d2d35954bed7e0c42bcc99c2
}
