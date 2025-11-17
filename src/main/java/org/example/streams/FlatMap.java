package org.example.streams;

import org.example.functionalinterfaces.data.Student;
import org.example.functionalinterfaces.data.StudentDatabase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FlatMap {
    static void main() {
        List<String> activities = StudentDatabase.getStudents().stream().map(Student::getActivities).flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(activities);
        System.out.println("******************* Distinct **************************");
        List<String> distinct = StudentDatabase.getStudents().stream().map(Student::getActivities).flatMap(List::stream)
                .distinct().collect(Collectors.toList());
        System.out.println(distinct);
        System.out.println("******************* Count **************************");
        Long count = StudentDatabase.getStudents().stream().map(Student::getActivities).flatMap(List::stream)
                .distinct().count();
        System.out.println(count);
        System.out.println("******************* Sorted **************************");
        List<String> sorted = StudentDatabase.getStudents().stream().map(Student::getActivities).flatMap(List::stream)
                .distinct().sorted().collect(Collectors.toList());
        System.out.println(sorted);
        System.out.println("******************* Students in Sorted Order by Name **************************");
        List<Student> students = StudentDatabase.getStudents().stream().sorted(Comparator.comparing((Student::getName))).collect(Collectors.toList());
        System.out.println(students);
        List<Student> student1 = StudentDatabase.getStudents().stream().sorted((s1,s2) -> s1.getName().compareTo(s2.getName())).collect(Collectors.toList());
        System.out.println(student1);

        System.out.println("******************* Students in Sorted Order by GPA Desc**************************");
        List<Student> student2 = StudentDatabase.getStudents().stream().sorted(Comparator.comparing(Student::getGpa).reversed()).collect(Collectors.toList());
        System.out.println(student2);



    }
}
