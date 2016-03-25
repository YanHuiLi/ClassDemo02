package com.archer.src;

/**
 * Created by Archer on 2016/3/24.
 */
public class ClassDemo02 {
    public static void main(String[] args) {
      People people=new People(30,"ddd");



    }

}

class People{
    int age;
    String name;

    //构造方法 自动执行，构造方法名称和类名一致，切没返回值
    public People(int a,String n){
        this.age=a;
        this.name=n;
        System.out.println("姓名"+name+"年龄"+age);
    }
//构造方法的重载。
    public People(int i){
          age=i;
        System.out.println("年龄"+age);
    }

}