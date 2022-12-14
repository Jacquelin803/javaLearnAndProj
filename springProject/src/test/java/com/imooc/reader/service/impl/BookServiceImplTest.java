package com.imooc.reader.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.imooc.reader.entity.Book;
import com.imooc.reader.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class BookServiceImplTest {

    @Resource
    private BookService bookService;
    @Test
    public void paging() {
        IPage<Book> paging = bookService.paging(2l,"score",2, 10);
        List<Book> records = paging.getRecords();
        for(Book b : records){
            System.out.println(b.getBookId()+" : "+b.getBookName());
        }
        System.out.println("Total Pages: "+paging.getPages());
        System.out.println("Total Records: "+paging.getTotal());
    }
}