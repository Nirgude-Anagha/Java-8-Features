package org.example.functionalinterfaces;

import org.example.functionalinterfaces.data.Student;
import org.example.functionalinterfaces.data.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BiConsumerExample {

    static void nameAndActivities(){
        List<Student> students = StudentDatabase.getStudents();
        BiConsumer<String, List<String>> biConsumer = (name,activities)->{
            System.out.println(name+" "+activities);
        } ;
        students.forEach(student -> {
            biConsumer.accept(student.getName(),student.getActivities());
        });

    }


    static void main() {
        BiConsumer<String, String> consumer = (a,b) -> System.out.println("a : " + a + " b : " + b);
        consumer.accept("Hello", "World");

        BiConsumer<Integer, Integer> multiply = (a,b) -> System.out.println("Multiplication : " + a*b);
        multiply.accept(12,3);

        BiConsumer<Integer, Integer> division = (a,b) -> System.out.println("Division : " + a/b);
        division.accept(12,3);

        System.out.println("-----------------multiply.andThen(division).accept(12,3)-----------------------");
        multiply.andThen(division).accept(12,3);

        System.out.println("-----------------nameAndActivities-----------------------");
        nameAndActivities();

    }
}
