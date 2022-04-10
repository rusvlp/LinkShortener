package com.rusvlp.urlshortener;

import com.rusvlp.urlshortener.model.URL;
import com.rusvlp.urlshortener.repos.URLRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UrlShortenerApplication {

    public static void main(String[] args) {
        SpringApplication.run(UrlShortenerApplication.class, args);

    }

}
