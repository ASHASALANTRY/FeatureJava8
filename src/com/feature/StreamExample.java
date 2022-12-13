package com.feature;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    // Main driver method
    public static void main(String[] args)
    {

        // Creating an ArrayList object of integer type
        ArrayList<Integer> al = new ArrayList<Integer>();

        // Inserting elements to ArrayList class object
        // Custom input integer numbers
        al.add(2);
        al.add(6);
        al.add(9);
        al.add(4);
        al.add(20);

        // First lets print the collection
        System.out.println("Printing the collection : "
                + al);

        // Stream operations
        // 1. Getting the stream from this collection
        // 2. Filtering out only even elements
        // 3. Collecting the required elements to List
        List<Integer> ls
                = al.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());
        // Print the collection after stream operation as stored in List object
        System.out.println("Printing the List after stream operation : " + ls);

        Stream s = Stream.of(1,2,3,4);
        Optional<Integer> i = s.findFirst();
      //  Optional<Integer> i1 = s.findFirst();


        System.out.println(
                "First Element: "
                        + i);
    }

}
