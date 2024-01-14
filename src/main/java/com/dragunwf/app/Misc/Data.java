package com.dragunwf.app.Misc;

import java.util.ArrayList;

public class Data {
    private static ArrayList<Student> students = new ArrayList<>();
    
    public static ArrayList<Student> getStudents() {
        return students;
    }
    
    public static void addDummyData() {
        Student[] dummyData = {
            new Student("Jack", 2.25),
            new Student("Faye", 1.5),
            new Student("Brad", 3.0),
            new Student("Jarvis", 1.75),
            new Student("Marc", 1.0),
            new Student("Scott", 1.25)
        };
        for (Student student : dummyData) {
            students.add(student);
        }
    }
}
