/*Write a java program to calculate the mean angle between hour arm and minute arm of analoge watch.*/
package com.rc.basiclogic;
import java.util.Scanner;
public class CalculateMeanAngle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hr = sc.nextInt();
        int min = sc.nextInt();

        System.out.println("Mean Angle between "+hr+"hr and "+min+"min is "+meanAngle(hr, min));
    }
    static double meanAngle(int hr, int min){
        double mAngle = min * 6;
        double hAngle = hr * 30 + min * 0.5;
        double angle = 0.0;
        if(hAngle > mAngle)
            angle = hAngle - mAngle;
        else
            angle = mAngle - hAngle;

        if(angle > 180)
            angle = 360 - angle;

        return angle;
    }
}
