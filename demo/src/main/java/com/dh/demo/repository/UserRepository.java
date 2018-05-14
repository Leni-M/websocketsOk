package com.dh.demo.repository;

import com.dh.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jhonny on 6/17/17.
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
