package org.example.functionalinterfaces;

import org.example.functionalinterfaces.data.Student;
import org.example.functionalinterfaces.data.StudentDatabase;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    static Predicate<Integer> p = i -> i %2 == 0;
    static Predicate<Integer> p1 = i -> i %5 == 0;

    static Predicate<Student> studentPredicate1 = s -> s.getGradeLevel()>=3;
    static Predicate<Student> studentPredicate2 = s -> s.getGpa()>=3.2;

    static void predicateAnd(){
        System.out.println(p.and(p1).test(10));
    }

    static void predicateOr(){
        System.out.println(p.or(p1).test(4));
    }

    static void predicateNegate(){
        System.out.println(p.negate().test(10));
        System.out.println(p.or(p1).negate().test(9));
    }

    static void predicateStudent(){
        List<Student> students = StudentDatabase.getStudents();
        students.forEach(student -> {
            if(studentPredicate1.and(studentPredicate2).test(student)){
                System.out.println(student);
            }
        });
    }

    static void main() {

        System.out.println(p.test(2));
        System.out.println("---------------predicateAnd-----------------");
        predicateAnd();
        System.out.println("---------------predicateOr-----------------");
        predicateOr();
        System.out.println("---------------predicateNegate-----------------");
        predicateNegate();
        System.out.println("---------------predicateStudent-----------------");
        predicateStudent();
    }
}
