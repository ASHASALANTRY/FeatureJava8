package com.feature;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

public class practice {
    int x=1;
    int y=2;
    BiConsumer ref = (a,b) -> {

        int z=10;
        z=1;
        // Modifying value of enclosing scope field
        System.out.println("ToString- " + y);
        //super.showValue("Calling from Lambda");

    };
static void methodL(Function f){
    System.out.println(f.apply(2));
}
    static Consumer methodM(){

        return (t)-> {
            t=10;
            System.out.println(t);
        };
    }
        //System.out.println("Result is- " + ref.calculate(8, 6));
public static void main(String args[]){

    new practice().ref.accept(new practice().x,new practice().y );
methodM().accept(1);
    methodL((t)->{
        int i=10;
        return t;
    });

}
}
