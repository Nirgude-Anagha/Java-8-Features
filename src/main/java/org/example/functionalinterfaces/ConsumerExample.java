package org.example.functionalinterfaces;

import org.example.functionalinterfaces.data.Student;
import org.example.functionalinterfaces.data.StudentDatabase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    static Consumer<Student> c1 = (student) -> System.out.println(student);
    static Consumer<Student> c2 = (student) -> System.out.print(student.getName());
    static Consumer<Student> c3 = (student) -> System.out.println(student.getActivities());

    static void printName(){
        List<Student> students = StudentDatabase.getStudents();
        students.forEach(c1);
    }

    static void printNameAndActivities(){
        List<Student> students = StudentDatabase.getStudents();
        students.forEach(c2.andThen(c3)); //consumer chaining
    }

    static void printNameAndActivitiesUsingCondition(){
        List<Student> students = StudentDatabase.getStudents();
        students.forEach((student) -> {
            if(student.getGradeLevel()>=3){
                c2.andThen(c3).accept(student);
            }
        });
    }


    static void main() {
        Consumer<String> consumer = s -> System.out.println(s.toUpperCase());
        consumer.accept("Hello");

        System.out.println("-------------printName-------------------");
        printName();
        System.out.println("-------------printNameAndActivities-------------------");
        printNameAndActivities();
        System.out.println("-------------printNameAndActivitiesUsingCondition-------------------");
        printNameAndActivitiesUsingCondition();



    }
}
