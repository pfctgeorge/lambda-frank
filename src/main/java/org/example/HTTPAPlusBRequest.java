package org.example;

import java.util.Map;

import lombok.Data;

@Data
public class HTTPAPlusBRequest {
    private Map<String, String> queryStringParameters;
}
