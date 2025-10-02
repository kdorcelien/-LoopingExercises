package com.pluralsight;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 4) {
            System.out.println("I love Java");
            i+=1;
        }
        do {
            System.out.println("I love Java");
            i += 1;

        } while (i<5);
    }
}
