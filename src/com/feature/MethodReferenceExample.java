package com.feature;
import java.util.function.Consumer;
@FunctionalInterface
interface Demo1{
    void method1();
}

public class MethodReferenceExample {
    public void staticReference(){
        System.out.println("static reference");
    }
    public static void staticReference1(int i){
        System.out.println("static reference with argument: " + i);
    }
    public  static void main(String args[]){
        MethodReferenceExample obj = new MethodReferenceExample();

      // Demo1 i =() -> MethodReferenceExample.staticReference(); //lambda expression

        Demo1 i1 = obj::staticReference;//static method reference
        i1.method1();
        Consumer<Integer> i2 =MethodReferenceExample::staticReference1;
       i2.accept(3);
    }


}
