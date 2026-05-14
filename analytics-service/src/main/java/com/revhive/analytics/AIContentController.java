package com.revhive.analytics;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ai")
public class AIContentController {
    @Autowired
    private AIService aiService;

    @PostMapping
    public ResponseEntity<AIResponse> handle (@RequestBody AIRequest request)
    {
        String result=aiService.process(request);
        return ResponseEntity.ok(new AIResponse(result));
    }
}
