package org.example.lambdas;

import java.util.Comparator;

public class ComparatorExample {

    static void main() {
        Comparator<Integer> comparator = (a, b) -> b.compareTo(a);


        System.out.println(comparator.compare(2,1));

    }
}
