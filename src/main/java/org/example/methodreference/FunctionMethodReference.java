package org.example.methodreference;

import java.util.function.Function;

public class FunctionMethodReference {

    static Function<String, String> function = String::toLowerCase;

    static void main() {
        System.out.println(function.apply("Hello"));
    }
}
