package com.rusvlp.urlshortener.pagesController;

import com.rusvlp.urlshortener.model.URL;
import com.rusvlp.urlshortener.repos.URLRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReedirectController {
    @GetMapping("{pv}")
    public RedirectView redirect(@PathVariable String pv){
        System.out.println(pv);
        URL u = URLRepository.getURL(pv);
        return new RedirectView(u.getUrl());
    }
}
