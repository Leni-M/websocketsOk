package com.dh.demo.repository;

import com.dh.demo.domain.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jhonny on 6/17/17.
 */
public interface GroupRepository extends CrudRepository<Group, Long> {
}
