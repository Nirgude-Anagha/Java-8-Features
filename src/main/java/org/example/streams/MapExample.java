package org.example.streams;

import org.example.functionalinterfaces.data.Student;
import org.example.functionalinterfaces.data.StudentDatabase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapExample {

    static void main() {
        List<String> students = StudentDatabase.getStudents().stream().map(Student::getName)
                .map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(students);

        Set<String> students1 = StudentDatabase.getStudents().stream().map(Student::getName)
                .map(String::toUpperCase).collect(Collectors.toSet());
        System.out.println(students1);
    }
}
