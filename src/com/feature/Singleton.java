package com.feature;

public class Singleton {
    private Singleton(){
        System.out.print("private const");

    }
    private static  boolean tickitstatus=false;
    private static Singleton newTickit;
    public static Singleton getSingleton(){
        if(tickitstatus == false){
            newTickit = new Singleton();
            tickitstatus = true;
            return newTickit;
        }
        return newTickit;
    }

}
class customer{
    public static void main(String args[]){
        Singleton.getSingleton();
    }
}
