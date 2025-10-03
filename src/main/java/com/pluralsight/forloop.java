package com.pluralsight;

public class forloop {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 11; i++){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Launch!");
    }
}
