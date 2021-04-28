package com.hjy.controller;

import com.hjy.pojo.Books;
import com.hjy.service.BookServiceImpl;
import org.apache.ibatis.annotations.Param;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hjystart
 * @create 2021-04-15 22:50
 */
@Controller
@RequestMapping("/book")
public class BooksController {
    @Autowired
    @Qualifier("BookServiceImpl")
    BookServiceImpl bookService;
    @RequestMapping("/allBooks")
    public String getAllBooks(Model model){
        List<Books> books=bookService.getAllBooks();
        System.out.println(books);
        model.addAttribute("books",books);
        return "allBooks";
    }
    @RequestMapping("/toAddBook")
    public String toAddBook(Books books){
        return "addBook";
    }
    @RequestMapping("/addBook")
    public String addBook(Books books){
        System.out.println(books);
         bookService.addBook(books);
        return "redirect:/book/allBooks";
    }
    @RequestMapping("/toUpdateBook")
    public String toUpdateBook(int bookID,Model model){
        Books books=bookService.getBookByID(bookID);
        model.addAttribute("book",books);
        return "toUpdateBook";
    }
    @RequestMapping("/updateBook")
    public String updateBook(Books books){
        bookService.updateBook(books);
        return "redirect:/book/allBooks";
    }
    @RequestMapping("/deleteBook")
    public String deleteBook(int bookID){
        bookService.deleteBookByID(bookID);
        return "redirect:/book/allBooks";
    }
    @RequestMapping("/searchBook")
    public String searchBook(String bookName,Model model){
        List<Books> list=new ArrayList<Books>();
        Books books=bookService.searchBook(bookName);
        list.add(books);
        model.addAttribute("books",list);
        return "allBooks";
    }
}
