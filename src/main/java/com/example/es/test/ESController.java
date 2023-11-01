package com.example.es.test;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ESController {

    private final ESRepository esRepository;
    private final ESService esService;

    @GetMapping("/test")
    public ResponseEntity<?> test(@RequestParam String station) throws Exception{
        return ResponseEntity.ok().body(esService.test(station));
    }
}
