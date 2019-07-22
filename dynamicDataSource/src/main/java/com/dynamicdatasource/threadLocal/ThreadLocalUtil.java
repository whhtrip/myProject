package com.dynamicdatasource.threadLocal;

public class ThreadLocalUtil {
    private static ThreadLocal<String> tl = new ThreadLocal<String>();

    public static void main(String[] args) {
        int i=0;
        for (; i < 4; i++) {
            int finalI = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(finalI);
                    tl.set("我是线程" + finalI);
                    System.out.println("我要得到线程："+tl.get());
                }
            }).start();
        }
        tl.set("123");

        String s = tl.get();

        System.out.println(s);
    }
}
