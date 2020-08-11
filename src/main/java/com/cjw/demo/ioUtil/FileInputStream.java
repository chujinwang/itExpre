package com.cjw.demo.ioUtil;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInputStream {

    public static void main(String[] args) throws Exception{
//        InputStream is = new java.io.FileInputStream("D:\\rabbitmq\\test11.txt");
//        byte[] bytes = new byte[4];
//        int read = is.read(bytes);
//        System.out.println(new String(bytes));
//        System.out.println(read);
//        is.close();

        InputStream is = new java.io.FileInputStream("C:\\Users\\yangle\\Desktop\\frpClient\\frpc.64.exe");
        OutputStream os = new FileOutputStream("D:\\rabbitmq\\test\\frpc.64.exe");
        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = is.read(bytes))!=-1){
            os.write(bytes,0,len);
        }

        os.close();
        is.close();
    }
}
