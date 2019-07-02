package com.json;




import com.fasterxml.jackson.databind.util.JSONPObject;
import org.json.JSONObject;

import java.util.Date;

/**
 * JSON数据转换：
 * 1，单一对象转为JSON数据
 * 2，数组转为JSON数据
 * 3，JSON数据转为对象
 * 4，JSON数据转为数组
 */
public class JsonTest {
    public void test(){

    }
    public static void main(String[] args) {
        User user  = new User((long) 1231,"张飞",12,new Date());
        String userJson = "{ \"userId\":1231,\"userName\":\"张飞\",\"age\":12,null}";

        JSONPObject jsonpObject = new JSONPObject(userJson,User.class);

        System.out.println(jsonpObject);
        System.out.println(jsonpObject.getValue().toString());
        User value = (User) jsonpObject.getValue();
        System.out.println(value);
    }
}
