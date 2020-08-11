package com.cjw.demo.lambda;


public class Lambda {

    public static void main(String[] args){
        Comparator comparator = ()->{
            System.out.println("test");
        };
        comparator.compare();
        //1.参数只有一个的话可以省略括号
        Comparator1 comparator1 = a->{
            System.out.println(a);
        };
        comparator1.compare(10);
        //2.参数类型可以省略
        Comparator2 comparator2 = (a,arg)->
            System.out.println("a="+a+"arg"+arg);
        ;
        comparator2.compare(1,"sdf");
        //方法体只有一句话的话可以省略大括号，但是return也必须省略
        Comparator3 comparator3 = ( a)->a+43;

        int res = comparator3.compare(123);
        System.out.println(res);

    }


}


@FunctionalInterface
interface Comparator{
    //无参数 无返回
    void compare();
}
@FunctionalInterface
interface Comparator1{
    //1个参数 无返回
    void compare(int a);
}
@FunctionalInterface
interface Comparator2{
    //多个参数 无返回
    void compare(int a,String arg);
}
@FunctionalInterface
interface Comparator3{
    //有返回有参数
    int compare(int a);
}



