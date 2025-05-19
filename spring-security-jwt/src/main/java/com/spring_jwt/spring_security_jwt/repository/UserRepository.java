package com.spring_jwt.spring_security_jwt.repository;

import com.spring_jwt.spring_security_jwt.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public class UserRepository extends JpaRepository<User, Integer> {
    @Query("SELECT e From User e JOIN FETCH e.roles WHERE e.username= (:username)")
    public User findByUsername(@Param("username") String username);

    boolean existsbyUsername(String username);
}
