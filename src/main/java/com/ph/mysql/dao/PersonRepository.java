package com.ph.mysql.dao;

import com.ph.mysql.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {
}
