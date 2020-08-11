package com.cjw.demo.ioUtil;

import java.io.*;
import java.io.FileInputStream;

public class OutStream {

    public static void main(String[] args) throws Exception{
        InputStreamReader isc = new InputStreamReader(new FileInputStream("test.txt"));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("test1.txt"));
        char[] chars = new char[1024];
        int len = 0;
        while((len = isc.read(chars))!=-1){
            osw.write(chars,0,len);
        }
        osw.close();
        isc.close();
    }
}
