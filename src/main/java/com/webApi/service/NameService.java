package com.webApi.service;

import com.webApi.dto.NameDTO;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NameService {
    private final List<String> allowedNames = List.of("NESTOR", "JORGE", "ANDY", "ERIC");

    public boolean verifyName(NameDTO name){
        if (name == null || name.getName().trim().isEmpty()){
            throw new IllegalArgumentException("El campo name no puede estar vacio");
        }

        String normalizedName = name.getName().trim().toUpperCase();
        return allowedNames.contains(normalizedName);
    }

}
