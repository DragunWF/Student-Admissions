package com.dragunwf.app.Misc;

import com.dragunwf.app.UserInterface.ApplyStudentForm;
import com.dragunwf.app.UserInterface.IntroMenu;
import com.dragunwf.app.UserInterface.StudentMenu;
import com.dragunwf.app.UserInterface.ViewStudents;

import java.util.HashMap;

public class WindowManager {
    private static HashMap<String, Boolean> windowsOpened;
    private static IntroMenu introMenu;
    private static ApplyStudentForm applyStudentForm;
    private static StudentMenu studentMenu;
    private static ViewStudents viewStudents;
    
    public static void openIntroMenu() { open("introMenu"); }
    public static void openApplyStudentForm() { open("applyStudentForm"); }
    public static void openStudentMenu() { open("studentMenu"); }
    public static void openViewStudents() { open("viewStudents"); }
    
    public static void initialize() {
        windowsOpened = new HashMap<>();
        windowsOpened.put("introMenu", false);
        windowsOpened.put("applyStudentForm", false);
        windowsOpened.put("studentMenu", false);
        windowsOpened.put("viewStudents", false);
    }

    private static void open(String name) {
        if (windowsOpened.get(name)) {
            return; // avoids window duplication
        }

        switch (name) {
            case "introMenu" -> { 
                introMenu = new IntroMenu();
                introMenu.setVisible(true);
                introMenu.setResizable(false);
            }
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
            default -> System.out.println("Window name is not recognized!");
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
