package com.omi.springboot_in_vs_code.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.omi.springboot_in_vs_code.model.Address;
import com.omi.springboot_in_vs_code.model.Users;

public interface AddressRepository  extends JpaRepository<Address, Long>{
    List<Address> findByUser(Users user);
}
