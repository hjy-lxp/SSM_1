package com.hjy.dao;

import com.hjy.pojo.Books;
import org.apache.ibatis.annotations.Param;


import java.util.List;

/**
 * @author hjystart
 * @create 2021-04-14 20:26
 */

public interface BooksMapper {
    //增加一本书
    int addBook(Books book);
    //删除一本书
    int deleteBook(@Param("bookID") Integer bookID);
    //修改一本书
    int updateBook(Books book);
    //查询一本书
    Books getBookById(@Param("bookID") Integer bookID);
    //查询所有书籍
    List<Books> getAllBooks();
    //搜索书籍
   Books searchBook(@Param("bookName") String bookName);

}
