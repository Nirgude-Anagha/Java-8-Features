package org.example.functionalinterfaces.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String name;
    private int gradeLevel;
    private double gpa;
    private String gender;
    private List<String> activities = new ArrayList<>();
    private int notebooks;

    public Student(String s) {
        this.name = s;
    }

    public void printAllActivities()
    {
        System.out.println(activities);
    }
}
