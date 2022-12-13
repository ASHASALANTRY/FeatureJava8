package com.feature;

class Inheritance1{
    void method1(){
        System.out.println("parent class");
    }
}
public class InheritanceDemo extends Inheritance1{
    void method2(){
        System.out.println("child class");
    }
    public static void main(String args[]){
        InheritanceDemo in=new InheritanceDemo();
        in.method1();
        in.method2();
    }
}
