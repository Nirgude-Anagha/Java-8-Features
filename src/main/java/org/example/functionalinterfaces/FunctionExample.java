package org.example.functionalinterfaces;

import java.util.function.Function;

public class FunctionExample {

    static Function<String, String> function = (name) -> name.toUpperCase();
    static Function<String, String> addSomeString = (name) -> name.toLowerCase().concat("str");

    static String performConcat(){
        return addSomeString.apply("Hello");
    }

    static void main() {
        System.out.println(function.apply("Hello"));
        System.out.println(function.andThen(addSomeString).apply("Hello")); // first function then addSomeString Executed
        System.out.println(function.compose(addSomeString).apply("Hello")); // addSomeString and then first function executed

        System.out.println(performConcat());
    }
}
