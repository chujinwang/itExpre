package com.cjw.demo.lambda;

import java.util.function.Supplier;

//闭包可以提升变量的生命周期
public class TrueFinaLambda {
    public static void main(String[] args){
        Integer integer = getTest().get();
        System.out.println(integer);
    }

    private static Supplier<Integer> getTest(){
        int num = 10;
        return ()->num;
    }
}
