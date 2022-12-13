package com.feature;

//functional interface
@FunctionalInterface
interface function2{
    void method1(Integer a);
   //void method3();
}
@FunctionalInterface
interface Functional extends function2{
   default void equals(){
       System.out.print("hello");
   }
}

public class FuntionalLambda {

   public static void main(String [] args){

       //Instantiating interface using anonymous class
      /* Functional obj =new Functional() {
           @Override
           public void method1() {
               System.out.println("Anonymous class");
           }
       };*/
       //Instantiating Interface using Lambda expression
       int i=20;
       Functional obj1 =(k)-> System.out.println(i + 1);

       obj1.method1(1);
        obj1.equals();
      MethodBehaviour((j)->System.out.println("Lambda Expression as a method argument"+ j));

   }
   public static void MethodBehaviour(function2 obj2){
       obj2.method1(2);
   }

}
