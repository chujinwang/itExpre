package com.cjw.demo.ioUtil;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class huanchongOutPut {

    public static void main(String[] args) throws Exception{
        OutputStream os = new BufferedOutputStream(new FileOutputStream("test.txt"));

        os.write("test".getBytes());
        os.close();
    }
}
