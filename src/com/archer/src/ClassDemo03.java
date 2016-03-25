package com.archer.src;

/**
 * 匿名类的使用
 * Created by Archer on 2016/3/25.
 */
public class ClassDemo03 {

    public static void main(String[] args) {

//        Student student=new Student();
//        student.tell();

        //匿名对象的调用，针对只是使用一次。
        //使用匿名对象的使用方式。
        new Student().tell();

    }


}

class Student {

    void tell(){

        System.out.println("hello Archer");

    }


}
