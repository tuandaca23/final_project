package com.finalproject.library.service.impl;

import com.finalproject.library.model.City;
import com.finalproject.library.repository.CityRepository;
import com.finalproject.library.service.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CityServiceImpl implements CityService {
    private final CityRepository cityRepository;

    @Override
    public List<City> findAll() {
        return cityRepository.findAll();
    }
}


