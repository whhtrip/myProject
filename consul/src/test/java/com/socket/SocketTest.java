package com.socket;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestComponent;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
@SpringBootTest
@RunWith(SpringRunner.class)
public class SocketTest {
    @Test
    public void client() {
        try {
           Socket client = new java.net.Socket("127.0.0.1",9999);
           //获取输出流
            OutputStream outputStream = client.getOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            dataOutputStream.writeUTF("Hello：我来自这里");
            //获取输入流
            InputStream inputStream = client.getInputStream();
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            System.out.println("服务器响应："+dataInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void server() throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        while(true){
            System.out.println("等待远程连接：");
            Socket accept = serverSocket.accept();
        }
    }
}
