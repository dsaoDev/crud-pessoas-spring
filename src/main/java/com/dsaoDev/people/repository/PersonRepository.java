package com.dsaoDev.people.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dsaoDev.people.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{

}
