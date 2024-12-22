package dev.mookies.movies.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import dev.mookies.movies.domain.Reviews;
import dev.mookies.movies.services.ReviewService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@CrossOrigin(origins ="*")
@RequestMapping("/api/v1/reviews")
public class ReviewController {
    
    @Autowired
    private ReviewService reviewService;

    @PostMapping
    public ResponseEntity<Reviews> createReview(@RequestBody Map<String,String> payload) {
        //TODO: process POST request
        
        return new ResponseEntity<Reviews>(reviewService.createReview(payload.get("reviewBody"), payload.get("imdbId")),HttpStatus.CREATED);
    }
    
}
