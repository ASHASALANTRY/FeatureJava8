package com.feature;

interface Construct{
    void method2(String str);
}
class Demo{
    Demo(String a){
        System.out.println(a);
    }

}
public class ConstructorReference {
    public  static void main(String args[]){
        Construct obj = Demo::new;
        obj.method2("hello");
    }
}
