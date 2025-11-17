package org.example.streams;

import org.example.functionalinterfaces.data.Student;
import org.example.functionalinterfaces.data.StudentDatabase;

import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {
    static void main() {
        List<Student> student2 = StudentDatabase.getStudents().stream().filter(s -> s.getGender().equals("female")).collect(Collectors.toList());
        System.out.println(student2);
    }
}
