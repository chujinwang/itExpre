package com.cjw.demo.lambda;

import com.cjw.demo.entity.Test;

public class AdvancedLambda {

    public static void main(String[] args){
        Comparator3 comparator = a -> a;
        //方法调用
        Comparator3 com = AdvancedLambda::change;
        System.out.println(com.compare(142));
        //构造方法
        TestStudent student = () -> new Student();
        TestStudent s = Student::new;
        s.getStudent();
        //带参数的方法
        TestStudent1 student1 = Student::new;
        student1.getStudent(1,"小名");
    }
    public static int change(int a){
        return a;
    }
}
interface TestStudent{
    Student getStudent();
}

interface TestStudent1{
    Student getStudent(int id,String name);
}
