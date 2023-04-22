package com.example.demo.products

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("kotlin/")
class TestController {
    @GetMapping
    fun getMessage():ResponseEntity<String> = ResponseEntity.ok("PRivet")
}