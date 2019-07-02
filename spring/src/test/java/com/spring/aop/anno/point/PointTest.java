package com.spring.aop.anno.point;

import com.spring.DemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class PointTest {

    @Test
    public void test01() {
       // Point point = new Point();
        //point.test01();
        System.out.println("运行成功");
    }
}