package com.imooc.reader.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.imooc.reader.entity.Book;
import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * 图书服务
 */

public interface BookService {

    /**
     * 分页查询图书
     * //     * @param categoryId 分类编号
     * //     * @param order 排序方式
     *
     * @param page 页号
     * @param rows 每页记录数
     * @return 分页对象
     */
    public IPage<Book> paging(Long categoryId, String order, Integer page, Integer rows);

    /**
     * 根据图书编号查询图书对象,显示图书详情页要用
     * @param bookId 图书编号
     * @return 图书对象
     */
    public Book selectById(Long bookId);

    /**
     * 更新图书评分/评价数量
     */
    public void updateEvaluation();




}