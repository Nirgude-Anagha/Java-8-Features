package org.example.streams;

import org.example.functionalinterfaces.data.Student;
import org.example.functionalinterfaces.data.StudentDatabase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {

    public static Optional<Student> getHighestGPAStudent(){
        return StudentDatabase.getStudents().stream().reduce((s1, s2) -> {
            if(s1.getGpa()>s2.getGpa())
                return s1;
            else
                return s2;
        });
    }

    public static int intNoOfNotebooks(){

        int noOfNotebooks =  StudentDatabase.getStudents().stream()
                .filter(s -> s.getGradeLevel()>3)
                .map(s -> s.getNotebooks())
                .reduce(0, Integer::sum);
                //.reduce(0, (s1, s2) -> s1+s2);
        return noOfNotebooks;


    }

    static void main() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

        System.out.println(numbers.stream().reduce(1, (x,y) -> x*y));

        Optional<Student> highestGPA = ReduceExample.getHighestGPAStudent();
        System.out.println(highestGPA.isPresent());
        System.out.println(highestGPA.get());

        System.out.println("No of Notebooks : " + intNoOfNotebooks());
    }
}
