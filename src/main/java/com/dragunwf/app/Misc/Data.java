package com.dragunwf.app.Misc;

import java.util.ArrayList;

public class Data {
    private static ArrayList<Student> students = new ArrayList<>();
    private static String userType;
    
    public static String getUserType() { return userType; }
    public static void setUserType(String type) { userType = type; }
    
    public static ArrayList<Student> getStudents() {
        return students;
    }
    
    public static void addStudent(String name, double gwa) {
        students.add(new Student(name, gwa));
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
