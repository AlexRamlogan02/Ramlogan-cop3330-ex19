package org.example;

import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alexandra Ramlogan
 */
public class App 
{
    private static double calc = 703;
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        double weight, height, BMI;
        System.out.print("Your height in inches is : ");
        height = scan.nextDouble();
        System.out.print("Your weight in pounds is : ");
        weight = scan.nextDouble();

        BMI = (weight/(height * height)) * calc;
        System.out.println("Your BMI is " +BMI);
        if (BMI >= 18.5 && BMI <= 25)
        {
            System.out.println("You are in the ideal weight range");
        }
        else if(BMI < 18.5)
        {
            System.out.println("you are underweight. You should see your doctor");
        }
        else
        {
            System.out.println("You are overweight. You should see your doctor.");
        }
    }
}
