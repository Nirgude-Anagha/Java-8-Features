package org.example.functionalinterfaces;

import org.example.functionalinterfaces.data.Student;
import org.example.functionalinterfaces.data.StudentDatabase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class StudentFunctionExample {
    static Function<List<Student>, Map<String, Double>> mapOfStudents = students -> {
      Map<String, Double> map = new HashMap<>();
      students.forEach(student -> {
          if(PredicateExample.studentPredicate2.test(student))
            map.put(student.getName(), student.getGpa());
      });
      return map;
    };

    static void main() {
        System.out.println(mapOfStudents.apply(StudentDatabase.getStudents()));
    }
}
