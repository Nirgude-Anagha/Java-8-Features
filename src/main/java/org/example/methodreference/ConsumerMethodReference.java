package org.example.methodreference;

import org.example.functionalinterfaces.data.Student;
import org.example.functionalinterfaces.data.StudentDatabase;

import java.util.function.Consumer;

public class ConsumerMethodReference {
    static Consumer<Student> consumer = System.out::println;

    static Consumer<Student> consumer1 = Student::printAllActivities;

    static void main() {
        StudentDatabase.getStudents().forEach(consumer);
        StudentDatabase.getStudents().forEach(consumer1);
    }
}
