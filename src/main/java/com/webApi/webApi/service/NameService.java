package com.webApi.webApi.service;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NameService {
    private final List<String> allowedNames = List.of("NESTOR", "JORGE", "ANDY", "ERIC");

    public boolean verifyName(String name){
        String normalizedName = name.trim().toUpperCase();

        return allowedNames.contains(normalizedName);
    }

}
