package com.spring.designMode.single;

public class HungrySingle {
    private static HungrySingle hungrySingle = new HungrySingle();
    private HungrySingle (){}
    public static HungrySingle getInstance(){
        return hungrySingle;
    }
}
