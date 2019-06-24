package com.spring.designMode.single;

public class LazySingle {
    private static LazySingle lazySingle = null;
    private LazySingle(){}
    public static LazySingle getInstance(){
        if(lazySingle == null) {
            lazySingle = new LazySingle();
        }
        return lazySingle;
    }
}
