package com.dh.demo.repository;

import com.dh.demo.domain.GroupUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jhonny on 6/17/17.
 */
public interface GroupUserRepository extends JpaRepository<GroupUser, Long>{
}
