package com.spring.aop.anno;

import com.spring.aop.anno.point.Point;
import org.springframework.stereotype.Service;

@Service
public class PointMain {
    public static void main(String[] args) {
        Point point = new Point();
        point.test01();
    }
}
