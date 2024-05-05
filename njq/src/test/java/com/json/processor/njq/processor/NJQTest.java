package com.json.processor.njq.processor;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NJQTest {

    @Test
    void testParseJson() {
        JSONProcessor jsonProcessor = new JSONProcessor();
         String json = "{\"name\":\"John\", \"age\":30, \"car\":null}";
        try {
            JsonNode node = jsonProcessor.parseJson(json);
            assertEquals(node.get("name").asText(),"John");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
