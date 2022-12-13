package com.feature;
interface AnonymousInner{
    void methodInner();
}
public class InnerClassDemo {
    AnonymousInner anonymousInner=new AnonymousInner() {
        @Override
        public void methodInner() {
            System.out.println("Annonymous innerclass");
        }
    };
     int a=10;
    static int b=20;
    //Normal inner class
    private class InnerClass{
        int c=22;
        int d=33;

/*
        static int e=33; //Not allowed to declare static members inside regular inner class
*/

        void innerMethod(){
            System.out.println(a+","+b);
        }
      void innerMethod2(){
            innerMethod();
      }
    }
    void m1(){
        class MethodLocalInner{
            int a=1;
            void methodLocal(){
                System.out.println(a+"Method local inner");
            }
            
        }
        MethodLocalInner m =new MethodLocalInner();
        m.methodLocal();
    }
    static class InnerClass1{
        int c=22;
        int d=33;
        static void innerMethod(){
            InnerClass1 i1=new InnerClass1();
            System.out.println(i1.c+","+b+","+i1.c);   ///Cannot use this keyword in static context
        }
        void innerMethod2(){
            InnerClassDemo obj=new InnerClassDemo();

            System.out.println(this.c+","+ obj.a);
            innerMethod();
        }
        public static void main(String args[]){
            System.out.println("Inner main");
            InnerClass1 i1=new InnerClass1();
            i1.innerMethod2();

        }
    }
    public static void main(String args[]){
        InnerClassDemo i = new InnerClassDemo();
        InnerClass inner=i.new InnerClass();
        inner.innerMethod2();
        i.m1();
        i.anonymousInner.methodInner();


    }
}
