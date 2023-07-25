package com.amol.spring.boot.dao;

import com.amol.spring.boot.entities.Users;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Users, Integer> {
}
