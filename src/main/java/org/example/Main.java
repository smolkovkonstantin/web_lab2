package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int a =  scanner.nextInt();
        int b =  scanner.nextInt();

        System.out.println(a + b);
        System.out.println(a * b);
    }
}