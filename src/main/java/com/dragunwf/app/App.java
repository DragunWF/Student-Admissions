package com.dragunwf.app;

import com.dragunwf.app.UserInterface.IntroMenu;
import com.dragunwf.app.Misc.Data;

public class App {
    public static void main(String[] args) {
        System.out.println("Inserting data...");
        Data.addDummyData();
        System.out.println("Initializing App..."); 
        IntroMenu introMenu = new IntroMenu();
        introMenu.start();
    }
}
