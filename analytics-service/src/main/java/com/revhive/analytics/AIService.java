package com.revhive.analytics;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AIService {
    @Autowired
    private AIContentConfig config;
    private final String PYTHON_CONNECTIN_URL="http://localhost:8000/ai";

    public String process(AIRequest request)
    {
        ResponseEntity<AIResponse> response=config.restTemplate().postForEntity(PYTHON_CONNECTIN_URL,request, AIResponse.class);
        return response.getBody().getResult();
    }
}
