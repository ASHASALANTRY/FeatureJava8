package com.feature;

interface Ab1{
    void m1();
    static void m2(){
        System.out.println("hello");
    }
}
interface Ab2{
    void m1();
    static void m2(){
        System.out.println("hello, how are you?");
    }
}
public class OopsConcepts {
    public static void main(String args[]){
        A a=new A();
        a.m1();
        Ab2.m2();


    }
}
 class A implements Ab1,Ab2{

     @Override
     public void m1() {
         System.out.print("getting");
     }


 }
class B{

}
