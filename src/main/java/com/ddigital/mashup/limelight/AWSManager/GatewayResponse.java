package com.ddigital.mashup.limelight.AWSManager;

import java.util.Map;

public class GatewayResponse {

    private String body;
    private Map<String, String> headers;
    private int statusCode;
    private boolean isBase64Encoded;

    public GatewayResponse(boolean base64, int status, Map<String, String> headers, String body) {
        this.body = body;
        this.headers = headers;
        this.statusCode = status;
        this.isBase64Encoded = base64;
    }


    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public boolean isBase64Encoded() {
        return isBase64Encoded;
    }

    public void setBase64Encoded(boolean base64Encoded) {
        isBase64Encoded = base64Encoded;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
