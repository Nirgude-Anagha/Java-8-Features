package org.example.functionalinterfaces;

import org.example.functionalinterfaces.data.Student;
import org.example.functionalinterfaces.data.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {
    Predicate<Student> predicate1 = (s) -> s.getGradeLevel()>=2;
    Predicate<Student> predicate2 = (s) -> s.getGpa()>=3;

    BiPredicate<Integer, Double> biPredicate = (gradeLevel,gpa) -> gradeLevel>=3 && gpa>=2;

    BiConsumer<String, List<String>> biConsumer = (s1, s2) -> {System.out.println(s1 + " : " +s2);};
    Consumer<Student> studentConsumer = student -> {
        if (predicate1.and(predicate2).test(student)) {
            biConsumer.accept(student.getName(), student.getActivities());
        }
    };

    BiConsumer<String, List<String>> biConsumer2 = (s1, s2) -> {System.out.println(s1 + " : " +s2);};
    Consumer<Student> studentConsumer2 = student -> {
        if (biPredicate.test(student.getGradeLevel(), student.getGpa())) {
            biConsumer.accept(student.getName(), student.getActivities());
        }
    };

    void printNameAndActivities(){
        StudentDatabase.getStudents().stream().forEach(studentConsumer);
    }

    void printNameAndActivitiesUsingBiPredicate(){
        StudentDatabase.getStudents().stream().forEach(studentConsumer2);
    }

    static void main() {
        new  PredicateAndConsumerExample().printNameAndActivities();
        System.out.println("_________________________________________");
        new  PredicateAndConsumerExample().printNameAndActivitiesUsingBiPredicate();
    }
}
