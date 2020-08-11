package com.cjw.demo.ioUtil;

import java.io.FileWriter;
import java.io.Writer;

public class CharOutput {

    public static void main(String[] args) throws Exception{
        Writer w = new FileWriter("test.txt",true);

        w.write("大家好".toCharArray(),2,1);
        w.close();
    }
}
