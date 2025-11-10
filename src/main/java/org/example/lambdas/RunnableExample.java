package org.example.lambdas;

public class RunnableExample {

    public static void main() {
        Runnable runnable = () -> System.out.println("Hello World");
        new Thread(runnable).start();
    }
}
