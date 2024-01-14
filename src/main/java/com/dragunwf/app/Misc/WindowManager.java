package com.dragunwf.app.Misc;

import com.dragunwf.app.UserInterface.ApplyStudentForm;
import com.dragunwf.app.UserInterface.IntroMenu;
import com.dragunwf.app.UserInterface.StudentMenu;
import com.dragunwf.app.UserInterface.ViewStudents;

import java.util.HashMap;

public class WindowManager {
    private static HashMap<String, Boolean> windowsOpened;
    private static ApplyStudentForm applyStudentForm;
    private static StudentMenu studentMenu;
    private static ViewStudents viewStudents;

    private static void openWindow(String name) throws Exception {
        if (windowsOpened.get(name)) {
            return; // avoids window duplication
        }

        switch (name) {
            case "applyStudentForm" -> {
                applyStudentForm = new ApplyStudentForm();
                applyStudentForm.setVisible(true);
                applyStudentForm.setResizable(false);
            }
            case "studentMenu" -> {
                studentMenu = new StudentMenu();
                studentMenu.setVisible(true);
                studentMenu.setResizable(false);
            }
            case "viewStudents" -> {
                viewStudents = new ViewStudents();
                viewStudents.setVisible(true);
                viewStudents.setResizable(false);
            }
            default -> throw new Exception("Window name passed is not recognized!");
        }

        windowsOpened.put(name, true);
        for (String key : windowsOpened.keySet()) {
            if (!key.equals(name)) {
                windowsOpened.put(key, false);
            }
        }

        System.out.printf("Opened %sUI\n", name);
    }
}
