package project.nuts.short_url_system.short_url_service.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import project.nuts.short_url_system.short_url_service.aop.TestAnnotation;
import project.nuts.short_url_system.short_url_service.dto.request.TestRequest;

@RestController
@RequiredArgsConstructor
@RequestMapping("/short-url")
public class ShortUrlController {

    @TestAnnotation
    @GetMapping("/test/{jwt}")
    public String getTest(@PathVariable String jwt) {
        return "test!";
    }

    @TestAnnotation
    @PostMapping("/test")
    public String postTest(@RequestBody TestRequest testRequest) {
        return "test";
    }

}
