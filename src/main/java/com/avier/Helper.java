package com.avier;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Helper {
    public <T> T deserialize(String json, Class<T> baseClass) throws JsonProcessingException {
        return new ObjectMapper().readValue(json, baseClass);
    }
}
