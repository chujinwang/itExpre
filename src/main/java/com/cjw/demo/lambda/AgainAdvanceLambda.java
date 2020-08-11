package com.cjw.demo.lambda;

import java.util.ArrayList;

public class AgainAdvanceLambda {

    public static void main(String[] args){

        //不是用treeset的原因，如果相邻的id都是9的话 他会以为他们是相同的自动去重
        ArrayList<Student> arrayList = new ArrayList<Student>();
        arrayList.add(new Student(1,"小1"));
        arrayList.add(new Student(2,"小2"));
        arrayList.add(new Student(3,"小3"));
        arrayList.add(new Student(4,"小4"));
        arrayList.add(new Student(5,"小5"));
        arrayList.add(new Student(6,"小6"));
        arrayList.add(new Student(7,"小7"));
        arrayList.add(new Student(8,"小8"));
        arrayList.add(new Student(9,"小9"));
        arrayList.add(new Student(10,"小10"));
        arrayList.add(new Student(11,"小11"));
        System.out.println(arrayList);
        arrayList.sort((o1,o2)->o2.getId()-o1.getId());
        System.out.println(arrayList);
    }

}
