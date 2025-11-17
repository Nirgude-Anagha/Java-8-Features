package org.example.streams;

import org.example.functionalinterfaces.data.Student;
import org.example.functionalinterfaces.data.StudentDatabase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsExample {

    static void main() {
        Map<String, List<String>> map = StudentDatabase.getStudents().stream().filter(s -> s.getGradeLevel()>2).collect(Collectors.toMap(Student::getName, Student::getActivities));
        System.out.println(map);
    }
}
