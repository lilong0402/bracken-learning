package com.example.springbootgloballexceptionlearning.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @version 1.0
 * @Author 李龙
 * @Date 2023/3/28 14:16
 * @注释
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Article {
    private int id;
    private String title;
    private String author;
}
