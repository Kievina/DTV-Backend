package com.zipcode.repositories;

import com.zipcode.models.Admin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepo extends CrudRepository<Admin, Long> {
    Admin findByUsername(String username);
    Boolean existsByUsername(String username);
}
