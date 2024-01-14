package com.dragunwf.app.Misc;

public class Student {
    private String name;
    private double gwa;
    
    public Student(String name, double gwa) {
        this.name = name;
        this.gwa = gwa;
    }
    
    public String getName() { return name; }
    public double getGWA() { return gwa; }
    
    public void setName(String name) { this.name = name; }
    
    public void setGWA(double gwa) {
        if (gwa < 1.0) { 
            this.gwa = 1.0;
        } else if (gwa > 5.0) {
            this.gwa = 5.0;
        } else {
            this.gwa = gwa;
        }
    }
}
