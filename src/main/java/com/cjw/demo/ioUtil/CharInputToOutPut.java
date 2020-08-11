package com.cjw.demo.ioUtil;

import java.io.*;

public class CharInputToOutPut {
    public static void main(String[] args) throws Exception{




        Reader is = new FileReader("C:\\Users\\yangle\\Desktop\\frpClient\\frpc.64.exe");
        Writer os = new FileWriter("D:\\rabbitmq\\test\\frpc.64.exe");
        int len = 0;
        char[] c = new char[1024];
        while((len = is.read(c))!= -1){
            System.out.println(c.length);
            os.write(c,0,len);
        }
        is.close();
        os.close();
    }
}
