package com.feature;

class Clone1{
    int x=1, y=2;

}
class Clone2 implements Cloneable{
    int a,b;
    Clone1 t = new Clone1();
    Clone2(){
        a=10;
        b=20;
    }
    public Object  clone() throws CloneNotSupportedException {

        return super.clone();
    }
}
class clonableInterface {
    public static void main(String args[]) throws CloneNotSupportedException {
        Clone2 clone2 = new Clone2();
        Clone2 clone =(Clone2)clone2.clone();
        clone.a=20;
        clone.t.x=300;
        System.out.println(clone2.a+" "+clone2.t.x);
        System.out.println(clone.a+" "+clone.t.x);
    }
}