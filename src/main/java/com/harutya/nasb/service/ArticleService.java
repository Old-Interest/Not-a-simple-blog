package com.harutya.nasb.service;

import com.harutya.nasb.entity.Article;
import com.harutya.nasb.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {

    @Autowired
    ArticleRepository articleRepository;

    public List<Article> articles(){
        return articleRepository.findAll();
    }
}
