package com.spring.readXml;

import java.net.URL;

public class Dom4J {
    public void loadXmlFile(){
        URL url = Dom4J.class.getResource("/");
        System.out.println("当前路径为："+url);
    }
    public static void main(String[] args) {
        Dom4J dom4J = new Dom4J();
        dom4J.loadXmlFile();
    }
}
