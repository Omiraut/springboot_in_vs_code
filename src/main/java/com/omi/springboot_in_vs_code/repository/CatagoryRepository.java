package com.omi.springboot_in_vs_code.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.omi.springboot_in_vs_code.model.Catagory;

@Repository
public interface CatagoryRepository extends JpaRepository<Catagory, Long> {

}
