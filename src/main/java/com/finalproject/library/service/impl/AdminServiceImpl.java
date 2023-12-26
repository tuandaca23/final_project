package com.finalproject.library.service.impl;

import com.finalproject.library.dto.AdminDto;
import com.finalproject.library.model.Admin;
import com.finalproject.library.repository.AdminRepository;
import com.finalproject.library.repository.RoleRepository;
import com.finalproject.library.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Collections;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {
    @Autowired
    private final AdminRepository adminRepository;

    @Autowired
    private final RoleRepository roleRepository;

    @Override
    public Admin save(AdminDto adminDto) {
        Admin admin = new Admin();
        admin.setFirstName(adminDto.getFirstName());
        admin.setLastName(adminDto.getLastName());
        admin.setUsername(adminDto.getUsername());
        admin.setPassword(adminDto.getPassword());
        admin.setRoles(Collections.singletonList(roleRepository.findByName("ADMIN")));
        return adminRepository.save(admin);
    }

    @Override
    public Admin findByUsername(String username) {
        return adminRepository.findByUsername(username);
    }
}
