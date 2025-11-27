package com.webApi.webApi.controller;

import com.webApi.webApi.service.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/verify")
public class NameController {
    @Autowired
    private NameService nameService;

    @GetMapping("/name")
    public ResponseEntity<Boolean> verifyAllowedName(@RequestBody String name){
        boolean isAllowed = nameService.verifyName(name);

        return ResponseEntity.ok(isAllowed);
    }
}
