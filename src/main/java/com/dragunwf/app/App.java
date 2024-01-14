package com.dragunwf.app;

import com.dragunwf.app.UserInterface.IntroMenu;

public class App {
    public static void main(String[] args) {
        System.out.println("Initializing App...");
        IntroMenu introMenu = new IntroMenu();
        introMenu.start();
    }
}
