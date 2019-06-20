package com.socket;

import java.io.*;
import java.net.Socket;

public class client {
    public static void main(String[] args) {
        try {
            Socket client = new java.net.Socket("127.0.0.1", 9999);
            //获取输出流
            OutputStream outputStream = client.getOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            dataOutputStream.writeUTF("Hello：我来自这里");
            //获取输入流
            InputStream inputStream = client.getInputStream();
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            System.out.println("服务器响应：" + dataInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

