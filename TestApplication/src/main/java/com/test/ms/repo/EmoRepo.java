package com.test.ms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.ms.entity.Employee;

@Repository
public interface EmoRepo extends JpaRepository < Employee, Integer >{

}
