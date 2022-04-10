package com.rusvlp.urlshortener.RestController;

import com.rusvlp.urlshortener.model.URL;
import com.rusvlp.urlshortener.repos.URLRepository;
import com.rusvlp.urlshortener.responses.URLResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class URLController {
    @PostMapping("short")
    public URLResponse shortUrl(@RequestBody String url){

        URL u = new URL(url);
        return new URLResponse(URLRepository.putURL(u));

    }
}
