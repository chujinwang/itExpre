package com.cjw.demo.lambda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.ListIterator;

public class FinaLambda {

    public static void main(String[] args){
        ArrayList<Student> arrayList = new ArrayList();
        //Collections.addAll(arrayList,1,2,3,7,8,9,71,68,68,76,768,6786,78,98,18);
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
//        list.forEach( a ->{
//            if ((a % 2) ==0){
//                System.out.print(a);
//            }
//        });
//        ListIterator<Integer> it = list.listIterator();
//        while(it.hasNext()){
//            Integer next = it.next();
//            if (next<=50){
//                it.remove();
//            }
//        }
        System.out.println(arrayList);
        arrayList.removeIf(a -> a.getId()>4);
        System.out.println("最后一行"+arrayList);
    }
}
