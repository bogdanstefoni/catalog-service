package com.polarbookshop.catalogservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatalogServiceController {

    @GetMapping
    public String getMeeting() {
        return "Welcome to the book catalog!";
    }
}
