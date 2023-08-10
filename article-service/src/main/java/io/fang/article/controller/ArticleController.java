package io.fang.article.controller;

import io.fang.account.client.AccountClient;
import io.fang.account.model.User;
import io.fang.article.model.Article;
import io.fang.article.service.ArticleService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.NoSuchElementException;


@RestController
@RequestMapping("/articles")
@Tag(name = "文章")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @Autowired
    private AccountClient accountClient;

    @GetMapping("")
    public List<Article> findAll() {
        return articleService.findAll();
    }

    @GetMapping("/{id}")
    public Article findById(Long id) {
        Article article =  articleService.findById(id).orElseThrow(
            () -> new NoSuchElementException("Article not found by id: `%s`".formatted(id))
        );
        User user = accountClient.findById(article.getAuthorId());
        article.setAuthor(user);
        return article;
    }
}
