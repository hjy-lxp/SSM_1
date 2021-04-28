package com.hjy.service;


import com.hjy.pojo.Books;

import java.util.List;

/**
 * @author hjystart
 * @create 2021-04-15 9:54
 */
public interface BookService {
    //    增加图书方法
    int addBook(Books books);

    //删除图书方法
    int deleteBookByID(int id);

    //更新图书
    int updateBook(Books books);

    //查询图书
    Books getBookByID(int id);

    //查询所有图书
    List<Books> getAllBooks();
    //搜索一本书
    Books searchBook(String bookName);
}
