package com.feature;

@FunctionalInterface
interface TestInterface{
    int calculate(int i, int j);
}

class Test {
    public void showValue(String str) {
        System.out.println("Value is- " + str);
    }
}
public class LambdaScope extends Test{
    public static void main(String[] args) {
        LambdaScope obj = new LambdaScope();
        obj.getResult();
    }

    public void getResult(){
        int a=10;
        TestInterface ref = (x, y) -> {

               int z=10;
             z=a+1;
            // Modifying value of enclosing scope field
            System.out.println("ToString- " + this.toString());
            super.showValue("Calling from Lambda");
            return x+y;
        };
        System.out.println("Result is- " + ref.calculate(8, 6));
    }

}
