/**
 * UCF COP3330 Fall 2021 Assignment 5 Solution
 * Copyright 2021 Emily Radney
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scnr = new Scanner(System.in);
        int A, W, H, gender;
        double r, BAC;
        final double LEGAL = .08;

        // Gender and Rate (r)
        System.out.print("Enter a 1 if you are male or a 2 if you are female: ");
        gender = scnr.nextInt();

        if(gender == 1) {
            r = .73;
        }
        else {
            r = .66;
        }


        // Other Info (A,W,H)
        System.out.print("How many ounces of alcohol did you have? ");
        A = scnr.nextInt();
        System.out.print("What is your weight, in pounds? ");
        W = scnr.nextInt();
        System.out.print("How many hours has it been since your last drink? ");
        H = scnr.nextInt();

        BAC = (A * 5.14 / W * r) - .015 * H;
        System.out.printf("Your BAC is %f\n", BAC);
        System.out.println("It is " + (BAC >= LEGAL ? "" : "not ") + "legal for you to drive.");
    }
}
