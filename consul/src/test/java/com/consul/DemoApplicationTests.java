package com.consul;

import com.consul.controller.ConsulController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    ConsulController consulController;
    /**
            * 测试Consul发现
     * */
    @Test
    public void contextConsul() {
        consulController.getConsul();
    }
    @Test
    public void getConsulServiceName(){
        consulController.getConsulServiceName();
    }

}
