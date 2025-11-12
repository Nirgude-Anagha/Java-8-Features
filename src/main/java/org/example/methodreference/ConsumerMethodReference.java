package org.example.methodreference;

import org.example.functionalinterfaces.data.Student;
import org.example.functionalinterfaces.data.StudentDatabase;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerMethodReference {
    static Consumer<Student> consumer = System.out::println;

    static Consumer<Student> consumer1 = Student::printAllActivities;

    static Predicate<Student> p = ConsumerMethodReference::gradeGreaterThan;

    public static boolean gradeGreaterThan(Student s){
        return s.getGradeLevel()>3;
    }

    static void main() {
        StudentDatabase.getStudents().forEach(consumer);
        StudentDatabase.getStudents().forEach(consumer1);

        System.out.println("-----------------------");
        System.out.println(p.test(StudentDatabase.supplier.get()));

        System.out.println("---------After refactoring above logic--------------");
        System.out.println(p.test(StudentDatabase.supplier.get()));
    }
}
