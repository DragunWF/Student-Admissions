package com.dragunwf.app.Misc;

public class Utils {
    public static boolean removeStudent(String name) {
        if (Data.getStudents().contains(name)) {
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
