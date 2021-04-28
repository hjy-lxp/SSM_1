package com.hjy.service;

import com.hjy.dao.BooksMapper;
import com.hjy.pojo.Books;



import java.util.List;

/**
 * @author hjystart
 * @create 2021-04-15 9:55
 */

public class BookServiceImpl implements BookService {

    private BooksMapper booksMapper;

    public void setBooksMapper(BooksMapper booksMapper) {
        this.booksMapper = booksMapper;
    }

    public int addBook(Books books) {
        return booksMapper.addBook(books);
    }

    public int deleteBookByID(int id) {
        return booksMapper.deleteBook(id);
    }

    public int updateBook(Books books) {
        return booksMapper.updateBook(books);
    }

    public Books getBookByID(int id) {
        return booksMapper.getBookById(id);
    }

    public List<Books> getAllBooks() {
        return booksMapper.getAllBooks();
    }

    @Override
    public Books searchBook(String bookName) {
       return booksMapper.searchBook(bookName);
    }
}
