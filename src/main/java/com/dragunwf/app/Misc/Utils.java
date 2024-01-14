package com.dragunwf.app.Misc;

import java.util.ArrayList;

public class Utils {
    public static boolean removeStudent(String name) {
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0, n = Data.getStudents().size(); i < n; i++) {
            names.add(Data.getStudents().get(i).getName());
        }
        if (names.contains(name)) {
            for (int i = 0, n = Data.getStudents().size(); i < n; i++) {
                String studentName = Data.getStudents().get(i).getName();
                if (studentName.equalsIgnoreCase(name)) {
                    Data.getStudents().remove(i);
                    break;
                }
            }
            return true;
        }
        return false;
    }
}
