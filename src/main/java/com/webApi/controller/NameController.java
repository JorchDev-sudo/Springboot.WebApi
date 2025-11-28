package com.webApi.controller;

import com.webApi.dto.NameDTO;
import com.webApi.service.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/verify")
public class NameController {

    @Autowired
    private NameService nameService;

    @PostMapping("/name")
    public ResponseEntity<Boolean> verifyAllowedName(@RequestBody NameDTO name){
        boolean isAllowed = nameService.verifyName(name);

        return ResponseEntity.ok(isAllowed);
    }
}
