package com.json.processor.njq.processor;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONProcessor {

    private final ObjectMapper objectMapper;

    public JSONProcessor() {
        this.objectMapper = new ObjectMapper();
    }

    public JsonNode parseJson(String json) throws JsonProcessingException {
        return objectMapper.readTree(json);
    }

    public <T> T convertJsonToObject(String json, Class<T> valueType) throws JsonProcessingException {
        return objectMapper.readValue(json, valueType);
    }

    public String convertObjectToJson(Object value) throws JsonProcessingException {
        return objectMapper.writeValueAsString(value);
    }
}