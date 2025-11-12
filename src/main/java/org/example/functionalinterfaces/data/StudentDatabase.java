package org.example.functionalinterfaces.data;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class StudentDatabase {

    public static Supplier<Student> supplier = () -> {
        return new Student("Kush", 4, 3.1, "male", Arrays.asList("swimming","volleyball"));
    };

    public static List<Student> getStudents(){
        Student s1 = new Student("John", 2, 3.6, "male", Arrays.asList("swimming","dancing"));
        Student s2 = new Student("Mary", 4, 2.6, "female", Arrays.asList("swimming","basketball"));
        Student s3 = new Student("Anna", 3, 3.4, "female", Arrays.asList("basketball","dancing"));
        Student s4 = new Student("Kush", 4, 3.1, "male", Arrays.asList("swimming","volleyball"));

        List<Student> students = Arrays.asList(s1,s2,s3,s4);
        return students;
    }
}
