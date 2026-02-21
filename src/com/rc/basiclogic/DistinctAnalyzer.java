/*Write a java program to check the three integer are distinct or not*/
package com.rc.basiclogic;

import java.util.Scanner;

public class DistinctAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number : ");
        int b = sc.nextInt();
        System.out.println("Enter 3rd number : ");
        int c = sc.nextInt();

        if(a == b || b == c || a == c)
            System.out.println("Not Distinct");
        else
            System.out.println("Distinct");
    }
}
