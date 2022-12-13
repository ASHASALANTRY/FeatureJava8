package com.feature;

import java.util.function.BiConsumer;

public class LambdaExceptionHandling {
    public static void main(String[] args) {
        int[] dividers = {0, 3, 6, 9};
        int key = 9;
        process(key, dividers, wrapperLambda((k, d) -> System.out.println(k / d)));
        /* process(key, dividers, (i, j) -> {
            try {
                System.out.println(i/ j);
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic exception occurred in wrapper lambda.");
            }
        });*/
    }

    private static void process(int key, int[] dividers,
                                BiConsumer<Integer, Integer> consumer) {
        for (int divider : dividers) {
            consumer.accept(key, divider);
        }
    }
    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
        return (k, d) -> {
            try {
                consumer.accept(k, d);
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic exception occurred in wrapper lambda.");
            }
        };
}}
