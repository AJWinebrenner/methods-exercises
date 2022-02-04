package com.ajwine;

import java.util.Scanner;

public class Exercise_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(capFirstLetter(scanner.nextLine()));
    }

    public static String capFirstLetter(String string) {
        return string.substring(0,1).toUpperCase() + string.substring(1);
    }
}
