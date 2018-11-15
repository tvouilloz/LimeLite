package com.ddigital.mashup.limelight.AWSManager;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.HashMap;
import java.util.Map;

public class AWSLambdaHandler implements RequestHandler<Object, GatewayResponse> {

    private Map<String, String> headers = new HashMap<String, String>();

    @Override
    public GatewayResponse handleRequest(Object input, Context context) {
        headers.put("Content-Type", "application/json");
        try {


            return new GatewayResponse(false, 201, headers, "Message sent to ${Winner.@name}");
        } catch (Exception e) {
            return new GatewayResponse(false, 400, headers, e.getMessage());
        }
    }
}

/**
 * 1) Get the json from request
 *
 * 2) Send to database lambda function
 *
 * 3) reason, sender details and send voucher code and winner
 *
 * 4) return message sent
 *
 * */
