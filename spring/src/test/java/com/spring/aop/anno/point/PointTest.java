package com.spring.aop.anno.point;

import com.spring.DemoApplication;
import com.spring.aop.anno.PointMain;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class PointTest {
    @Autowired
    Point point;
    @Autowired
    PointMain pointMain;

    @Test
    public void test01() {
        Point p = new Point();
        point.test01();
        p.test01();
        PointMain.main(new String[]{});
    }
}