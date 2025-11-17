package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinMaxExample {
    static void main() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int maxValue = list.stream().reduce(0, (a,b) -> a>b?a:b);
        System.out.println("Max Value using reduce :" + maxValue);

        Optional<Integer> max = list.stream().reduce((a, b) -> a>b?a:b);
        System.out.println("Max Value using reduce :" + max.get());
    }
}
