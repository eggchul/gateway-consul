package com.example.gateway

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;


// handle fallback
@RestController
class Controller {

    @GetMapping("/api/fallback")
    Mono<String> getService1DownMsg() {
        return Mono.just("No response from service 1 and will be back shortly")
    }

}
