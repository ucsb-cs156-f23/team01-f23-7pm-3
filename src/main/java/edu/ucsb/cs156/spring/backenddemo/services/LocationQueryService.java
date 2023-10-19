package edu.ucsb.cs156.spring.backenddemo.services;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;


import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;


@Slf4j 
@Service
public class LocationQueryService {

    private final RestTemplate restTemplate;

    public LocationQueryService(RestTemplateBuilder restTemplateBuilder) {
        restTemplate = restTemplateBuilder.build();
    }

    public static final String ENDPOINT = "https://nominatim.openstreetmap.org/search?q={location}&format=json";

    public String getJSON(String location) throws HttpClientErrorException {
        
        log.info("location={}", location);

        Map<String, String> uriVariables = Map.of("location", location);
        




        
        return "";
    }
}