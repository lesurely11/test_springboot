package com.itheima.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.domain.Book;
import com.itheima.domain.Holiday;
import com.itheima.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookDaoTestCase {
    @Autowired
    private UserDao userDao;
    @Autowired
    private HolidayDao holidayDao;
    @Test
    void testGetById(){
        System.out.println(userDao.selectById(1));
    }
    @Test
    void testinsertuser(){
        User user = new User();
        user.setUsername("123");
        user.setPassword("123");
        user.setTag(1);
        userDao.insert(user);
        userDao.selectById(2);
    }
    @Test
    void testupdateuser(){
        User user = new User();
        user.setId(2);
        user.setUsername("123");
        user.setPassword("123");
        user.setTag(0);
        userDao.updateById(user);

    }
    @Test
    void testGetById2(){
        System.out.println(holidayDao.selectById(1));
    }
    @Test
    void testUpdateById2(){
        Holiday holiday = new Holiday();
        holiday.setId(1);
        holiday.setHolidayCause("上课");
        holiday.setHolidayTime("2022-01-23");
        holiday.setStudentName("nance");
        holiday.setHolidayIdea("不同意");
        holidayDao.updateById(holiday);
    }

    @Test
    void testInsertById2(){
        Holiday holiday = new Holiday();
        holiday.setId(2);
        holiday.setHolidayCause("上课");
        holiday.setHolidayTime("2022-01-23");
        holiday.setStudentName("nance");
        holiday.setHolidayIdea("不同意");
        holidayDao.insert(holiday);
    }
    /*@Autowired
    private BookDao bookDao;

    @Test
    void testGetById(){
        System.out.println(bookDao.selectById(1));
    }

    @Test
    void testSave(){
        Book book = new Book();
        book.setType("测试数据123");
        book.setName("测试数据123");
        book.setDescription("测试数据123");
        bookDao.insert(book);
    }

    @Test
    void testUpdate(){
        Book book = new Book();
        book.setId(17);
        book.setType("测试数据abcdefg");
        book.setName("测试数据123");
        book.setDescription("测试数据123");
        bookDao.updateById(book);
    }

    @Test
    void testDelete(){
        bookDao.deleteById(16);
    }

    @Test
    void testGetAll(){
        bookDao.selectList(null);
    }

    @Test
    void testGetPage(){
        IPage page = new Page(2,5);
        bookDao.selectPage(page, null);
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
        System.out.println(page.getPages());
        System.out.println(page.getRecords());
    }

    @Test
    void testGetBy(){
        QueryWrapper<Book> qw = new QueryWrapper<>();
        qw.like("name","Spring");
        bookDao.selectList(qw);
    }

    @Test
    void testGetBy2(){
        String name = "1";
        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<Book>();
        //if(name != null) lqw.like(Book::getName,name);
        lqw.like(name != null,Book::getName,name);
        bookDao.selectList(lqw);
    }
*/
}










