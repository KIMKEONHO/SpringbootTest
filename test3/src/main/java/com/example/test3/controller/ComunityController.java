package com.example.test3.controller;

import com.example.test3.dto.ContentForm;
import com.example.test3.entity.Comunity;
import com.example.test3.repository.ContentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class ComunityController {

    @Autowired
    private ContentRepository cr;

    @GetMapping("/comunity")
    public String com(){
        return "comunity/comunity";
    }

    @GetMapping("/content/new")
    public String createView(){
        return "comunity/New";
    }

    @PostMapping("/content/create")
    public String createContent(ContentForm form){
        log.info(form.toString());
        // dto -> entity 변환

        Comunity cm =form.toEntity();
        log.info(cm.toString());

        Comunity saved = cr.save(cm);
        log.info(saved.toString());
        return null;
    }
}
