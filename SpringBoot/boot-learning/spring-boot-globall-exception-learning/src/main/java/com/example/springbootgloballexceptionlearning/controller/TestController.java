package com.example.springbootgloballexceptionlearning.controller;

import com.example.springbootgloballexceptionlearning.domain.Article;
import com.example.springbootgloballexceptionlearning.service.ExceptionService;
import com.example.springbootgloballexceptionlearning.util.AjaxResponse;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @version 1.0
 * @Author 李龙
 * @Date 2023/3/28 14:16
 * @注释
 */
@RestController
@RequestMapping("api")
public class TestController {
    @Resource
    private ExceptionService exceptionService;

    @GetMapping("/articles/{id}")
    public AjaxResponse getArticle(@PathVariable("id") int id){
        if (id>3){
            exceptionService.systemBizError();
        }else if (id<=0){
            exceptionService.userBizError(id);
        }
        return  AjaxResponse.success(findArticleById(id));
    }
    private Article findArticleById(int id){
        List<Article> articles=List.of(new Article(1,"Spring从入门到精通","大佬"),new Article(2,"SpringBoot 从入门到精通","大牛"),new Article(3,"SpringClode 从入门到精通","学神"));
        return articles.stream().filter(article -> article.getId()==id).toList().get(0);

    }
}
