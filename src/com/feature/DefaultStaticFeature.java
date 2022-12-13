package com.feature;
 interface Interface2 {

    void method2();
    //Default Method Implementation in interface
    default void log(){
        System.out.println("Default Method Implementation1");
    }
     //Static Method Implementation in interface
     static void demo(){
         System.out.println("static method interface");
     }

}
 interface Interface1 {

    default void log(){

        System.out.println("Default Implementation2");
    }
}
public class DefaultStaticFeature implements Interface2,Interface1{

     public void demo(){
        System.out.println("static method class");
    }



    @Override
    public void method2() {
        System.out.println("abstract method Implementation");
    }

    @Override
    public void log() {
       System.out.println("overrided log");
       Interface1.super.log();
    }
    public  static  void main(String args[]){
        DefaultStaticFeature obj = new DefaultStaticFeature();

        obj.log();
        Interface2.demo();
        obj.method2();
    }




}
