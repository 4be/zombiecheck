package com.zombieab.demo.service;


import com.fasterxml.jackson.databind.util.JSONPObject;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class zombieCheck {


    @Autowired
    RestTemplate restTemplate;

    public void zombieserivce(String[] arguments) {

        System.out.println("hello");
        String url = "https://www.googleapis.com/customsearch/v1?key=AIzaSyBJ9dR1gc6NGEl91YryMcznK2SPcX4kEBI&cx=f61b3f13afb4b47f1&q=intitle:\"spongebob\" inurl:2010 site:*.blogspot.com&lr=lang_id&googlehost=google.co.id&gl=id&num=10&start=3";
        System.out.println(restTemplate.getForObject(url, String.class));

        HttpHeaders headers = new HttpHeaders();
        headers.add("X-te-ID", "externalId");
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> request = new HttpEntity<>(new String("bar"));
        ResponseEntity<request> response = restTemplate
                .exchange(
                        "https://www.googleapis.com/customsearch/v1?key=AIzaSyBJ9dR1gc6NGEl91YryMcznK2SPcX4kEBI&cx=f61b3f13afb4b47f1&q=intitle:\"spongebob\" inurl:2010 site:*.blogspot.com&lr=lang_id&googlehost=google.co.id&gl=id&num=10&start=3",
                        "GET",
                        "Mantap",
                        ""
                );
    }


}
