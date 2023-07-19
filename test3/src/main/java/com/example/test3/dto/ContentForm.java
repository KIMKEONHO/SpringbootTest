package com.example.test3.dto;

import com.example.test3.entity.Comunity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@NoArgsConstructor
@Slf4j
@ToString
@Getter

public class ContentForm {

    private String title;
    private String content;

    public ContentForm(String title,String content){
        this.content = content;
        this.title = title;
        log.info(title,content);
    }
    public Comunity toEntity(){
        return new Comunity(null,title,"jerry6475",content);
    }


}
