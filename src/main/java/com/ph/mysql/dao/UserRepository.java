package com.ph.mysql.dao;

import com.ph.mysql.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository  extends CrudRepository<User, Long> {
}
