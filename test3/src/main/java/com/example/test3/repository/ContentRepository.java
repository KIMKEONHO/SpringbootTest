package com.example.test3.repository;

import com.example.test3.entity.Comunity;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface ContentRepository extends CrudRepository<Comunity,Long> {
    ArrayList<Comunity> findAll();
}
