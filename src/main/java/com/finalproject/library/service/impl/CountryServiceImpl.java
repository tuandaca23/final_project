package com.finalproject.library.service.impl;

import com.finalproject.library.model.Country;
import com.finalproject.library.repository.CountryRepository;
import com.finalproject.library.service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryServiceImpl implements CountryService {
    private final CountryRepository countryRepository;

    @Override
    public List<Country> findAll() {
        return countryRepository.findAll();
    }
}
