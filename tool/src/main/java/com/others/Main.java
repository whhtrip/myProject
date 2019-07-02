package com.others;

import java.net.URL;

public class Main {
    public static void main(String[] args) {
        Class<Main> mainClass = Main.class;
        URL resource = mainClass.getResource("");
        System.out.println();
    }
}
