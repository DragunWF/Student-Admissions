package com.dragunwf.app.Misc;

import com.dragunwf.app.UserInterface.ApplyStudentForm;
import com.dragunwf.app.UserInterface.IntroMenu;
import com.dragunwf.app.UserInterface.StudentMenu;
import com.dragunwf.app.UserInterface.ViewStudents;
import com.dragunwf.app.UserInterface.OfficerMenu;
import com.dragunwf.app.UserInterface.AdmitStudentForm;

import java.util.HashMap;

public class WindowManager {
    private static HashMap<String, Boolean> windowsOpened;
    
    public static void openIntroMenu() { open("introMenu"); }
    public static void openApplyStudentForm() { open("applyStudentForm"); }
    public static void openStudentMenu() { open("studentMenu"); }
    public static void openViewStudents() { open("viewStudents"); }
    public static void openOfficerMenu() { open("officerMenu"); }
    public static void openAdmitStudentForm() { open("admitStudentForm"); }
    
    public static void initialize() {
        windowsOpened = new HashMap<>();
        String[] windowKeys = {
            "introMenu", "applyStudentForm", "studentMenu",
            "viewStudents", "officerMenu", "admitStudentForm"
        };
        for (String key : windowKeys) {
            windowsOpened.put(key, false);
        }
    }

    private static void open(String name) {
        if (windowsOpened.get(name)) {
            return; // avoids window duplication
        }

        switch (name) {
            case "introMenu" -> { 
                setDefault(new IntroMenu());
            }
            case "applyStudentForm" -> {
                setDefault(new ApplyStudentForm());
            }
            case "studentMenu" -> {
                setDefault(new StudentMenu());
            }
            case "viewStudents" -> {
                setDefault(new ViewStudents());
            }
            case "admitStudentForm" -> {
                setDefault(new AdmitStudentForm());
            }
            case "officerMenu" -> {
                setDefault(new OfficerMenu());
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
    
    private static void setDefault(javax.swing.JFrame window) {
        window.setVisible(true);
        window.setResizable(false);
    }
}
