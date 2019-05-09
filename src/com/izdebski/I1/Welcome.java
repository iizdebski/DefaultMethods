package com.izdebski.I1;

public class Welcome implements I1,I2{

    @Override
    public void display() {
        I2.super.display();
        I1.super.display();
        System.out.println("MBT Revolution");
    }

    public static void main(String[] args) {
        Welcome welcome = new Welcome();
        welcome.display();
    }
}