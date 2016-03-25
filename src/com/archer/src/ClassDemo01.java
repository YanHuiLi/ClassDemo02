package com.archer.src;

/**
 * 封装性的运用
 * Created by Archer on 2016/3/24.
 */
public class ClassDemo01 {
    public static void main(String[] args) {
        Person person=new Person();
        person.setName("Archer");
        person.setAge(23);
        person.tell();


    }
}

class Person{

    public int getAge() {
        return age;
    }

    void setAge(int a) {
        if (a>0&&a<=100){
            age = a;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //私有的，对外部不可见
    private int age;
    private String name;

    public void tell(){


        System.out.println( "姓名 ："+getName()+ "年龄 ："+getAge());
    }


}
