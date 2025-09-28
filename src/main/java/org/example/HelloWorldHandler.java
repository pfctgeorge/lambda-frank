package org.example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class HelloWorldHandler implements RequestHandler<HTTPAPlusBRequest, String> {
    @Override
    public String handleRequest(HTTPAPlusBRequest input, Context context) {
        int a = Integer.parseInt(input.getQueryStringParameters().get("a"));
        int b = Integer.parseInt(input.getQueryStringParameters().get("b"));
        return "\"" + (a + b) + "\"";
    }
}
