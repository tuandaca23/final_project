package com.finalproject.library.service;

import com.finalproject.library.dto.AdminDto;
import com.finalproject.library.model.Admin;

public interface AdminService {
    Admin save(AdminDto adminDto);

    Admin findByUsername(String username);
}
