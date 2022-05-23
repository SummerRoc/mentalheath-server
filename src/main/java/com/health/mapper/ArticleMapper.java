package com.health.mapper;

import com.github.pagehelper.Page;
import com.health.po.Article;

import java.util.List;


public interface ArticleMapper {

    Page<Article> findArticleByPage();

    List<Article> findArticleById(Integer et_id);

    int updataArticle(Article article);

    int addArticle(Article article);

    int deleteArticleById(Integer et_id);
}
