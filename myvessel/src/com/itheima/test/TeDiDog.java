package com.itheima.test;

public class TeDiDog extends Dog{

    public TeDiDog(){

    }

    public TeDiDog(String name, int age){
        super(name,age);
    }

    @Override
    public void eat() {
        System.out.println("一只叫做"+ getName() +"的，"+getAge()+"岁的泰迪，正在吃骨头，边吃边蹭");
    }
}
