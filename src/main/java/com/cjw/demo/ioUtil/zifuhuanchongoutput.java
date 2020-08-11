package com.cjw.demo.ioUtil;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class zifuhuanchongoutput {

    public static void main(String[] args) throws Exception{
        BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt",true));
        bw.write("你好");
        bw.write("你好");
        bw.write("你好");
        bw.write("你好");
        bw.write("你好");
        bw.write("你好");
        bw.write("你好");
        bw.write("你好");
        bw.flush();
        bw.write("你好");
        bw.close();
    }

}
