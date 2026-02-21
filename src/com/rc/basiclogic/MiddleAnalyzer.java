/*Write a java program to read all 3 integer values from the user and print the middle value among those three integer*/
package com.rc.basiclogic;

import java.util.Scanner;

public class MiddleAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = sc.nextInt();
        System.out.println("Enter second number : ");
        int b = sc.nextInt();
        System.out.println("Enter the 3rd number : ");
        int c = sc.nextInt();

        int max = (a > b)&& (a > c) ? a : b > c ? b : c;
        int min = (a < b) && (a < c) ? a : b < c ? b : c;

        System.out.println("Middle value among "+a+", "+b+", "+c+" is "+((a+b+c)-(max+min)));

    }
}
