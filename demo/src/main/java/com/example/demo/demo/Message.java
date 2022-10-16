package com.example.demo.demo;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Message {
    
    @NotBlank
    @Size(min = 2, max = 3)
    private String response;

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

}
