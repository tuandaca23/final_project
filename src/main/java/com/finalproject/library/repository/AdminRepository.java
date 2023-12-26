package com.finalproject.library.repository;

import com.finalproject.library.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface AdminRepository extends JpaRepository<Admin, Long> {
    Admin findByUsername(String username);
}
