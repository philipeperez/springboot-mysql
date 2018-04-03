package com.ph.mysql.dao;

import com.ph.mysql.model.Adress;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AdressRepository extends CrudRepository<Adress, Long> {
    public List<Adress> findAllByPersonId(Long id);
}
