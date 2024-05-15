package com.drinks.cocktails.controller;

import com.drinks.cocktails.dto.CoctialDTO;
import com.drinks.cocktails.service.CoctailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/drinks")
public class CoctailsController {

    @Autowired
    private CoctailService coctailService;

    @Autowired
    private Environment environment;

    
    @GetMapping(value = "/coctials/{coctialName}")
    public ResponseEntity<CoctialDTO> getAllCustomers(@PathVariable("coctialName") String coctialName) {