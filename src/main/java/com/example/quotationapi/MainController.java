package com.example.quotationapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class MainController {
    @RequestMapping("/")
    public @ResponseBody String showIndex(){
        RestTemplate restTemplate=new RestTemplate();
        Quote quote=restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        System.out.println(quote.getValue().toString());
        return quote.getValue().getQuote();
    }
}
