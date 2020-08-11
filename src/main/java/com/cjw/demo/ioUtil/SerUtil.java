package com.cjw.demo.ioUtil;

import com.cjw.demo.entity.Test;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerUtil {

    public static void main(String[] args) throws Exception{
        ObjectOutputStream ois = new  ObjectOutputStream(new FileOutputStream("test.data",true));
        Test test= new Test();
        test.setAge(1);
        test.setId("1");
        test.setScore(123);
        ois.writeObject(test);
        ois.close();

    }
}
