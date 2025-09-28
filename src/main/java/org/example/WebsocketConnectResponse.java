package org.example;

import java.util.Map;

import lombok.Data;

@Data
public class WebsocketConnectResponse {
    private boolean isBase64Encoded = false;
    private int statusCode = 200;
    private Map<String, String> headers = Map.of();
    private Map<String, String> multiValueHeaders = Map.of();
    private String body = "";
}
