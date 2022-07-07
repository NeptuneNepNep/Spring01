package sample.com.atguigu.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sample.com.atguigu.spring5.Book;
import sample.com.atguigu.spring5.User;

public class TestSpring5 {
    @Test
    public void testAdd() {
        //加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //获取配置创建的对象
        Book book = context.getBean("book", Book.class);
        System.out.println(book);


    }
}
