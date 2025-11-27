package com.webApi.webApi.controller;

import com.webApi.webApi.service.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/verify")
public class NameController {
    @Autowired
    private NameService nameService;

    @GetMapping("/name/{name}")
    public ResponseEntity<Boolean> verifyAllowedName(@PathVariable String name){
        boolean isAllowed = nameService.verifyName(name);

        return ResponseEntity.ok(isAllowed);
    }
}
