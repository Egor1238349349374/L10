package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder str = new StringBuilder(scanner.nextLine());
        str = str.reverse();
        StringBuilder str1 = new StringBuilder(scanner.nextLine());
        str1 = str1.reverse();
        if (str.toString().regionMatches(0, str1.toString(), 0, str1.length())){
            System.out.println("Есть");
        }
        else {
            System.out.println("Нет");
        }
    }
}
