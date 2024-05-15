package com.drinks.cocktails.service;

import com.drinks.cocktails.dto.CoctialDTO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class CoctailService {
    private static final Logger LOGGER = LogManager.getLogger(CoctialDTO.class);

    public CoctialDTO getCocktailDetails(String coctailName) {
        String url = "https://www.thecocktaildb.com/api/json/v1/1/search.php?s={coctialName}";
        WebClient webClient = WebClient.create();
        return webClient.get().uri(url, coctailName).retrieve().bodyToMono(CoctialDTO.class).block();

    }
}
