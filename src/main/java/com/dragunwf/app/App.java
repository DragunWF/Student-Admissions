package com.dragunwf.app;

import com.dragunwf.app.Misc.Data;
import com.dragunwf.app.Misc.WindowManager;

public class App {
    public static void main(String[] args) {
        System.out.println("Initializing WindowManager...");
        WindowManager.initialize();
        System.out.println("Inserting data...");
        Data.addDummyData();
        System.out.println("Initializing App...");
        WindowManager.openIntroMenu();
    }
}
