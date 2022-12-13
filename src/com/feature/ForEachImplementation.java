package com.feature;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;

public class ForEachImplementation {
    public static void main(String[] args) {

        //creating sample Collection
        List<Integer> myList = new ArrayList<Integer>();
myList.add(1);
        myList.add(1);myList.add(1);
        myList.add(1);

       /* for(int i=0; i<10; i++) myList.add(i);*/

        //traversing using Iterator
      /*  Iterator<Integer> it = myList.iterator();
        while(it.hasNext()){
            Integer i = it.next();
            System.out.println("Iterator Value::"+i);
            *//*if(i.equals(1)){
                myList.remove(i);
            }*//*
        }*/

        //traversing through forEach method of Iterable with anonymous class
       /* myList.forEach(new Consumer<Integer>() {

            public void accept(Integer t) {
                System.out.println("forEach anonymous class Value::"+t);
               //ConcurrentModificationException
                 *//* if(t.equals(1)){
                    myList.remove(t);
                }*//*
            }

        });*/
        //traversing with Consumer interface implementation
   /*     Consumer com =(t)->System.out.println("Consumer impl Value::"+t);*/
        myList.forEach((t)->System.out.println("Consumer impl Value::"+t));

       /* myList.forEach((t)-> {
            System.out.println("Consumer impl Value::" + t);

        });*/

    }
}
//Consumer implementation that can be reused
class MyConsumer implements Consumer<Integer>{

    public void accept(Integer t) {
        System.out.println("Consumer impl Value::"+t);
    }
}
