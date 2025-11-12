package org.example.methodreference;

import org.example.functionalinterfaces.data.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReference {

    static Supplier<Student> supplier = Student::new;

    static Function<String, Student> function = Student::new;

    static void main() {
        System.out.println(supplier.get());
        System.out.println(function.apply("Hello"));
    }
}
