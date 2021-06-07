/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Seney
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        boolean isNumber = false;
        String weight;
        String height;

        do {
            System.out.print("What is your weight in pounds? ");
            weight = scanner.next();
            isNumber = numberOrNot(weight);

        }while (isNumber = false);

        do {
            System.out.print(("What is your height in inches? "));
            height = scanner.next();
            isNumber = numberOrNot(height);

        }while (isNumber = false);

        double bmi;

        DecimalFormat df = new DecimalFormat("#.#");

        bmi = (Double.parseDouble(weight) / (Double.parseDouble(height) * Double.parseDouble(height))) * 703;

        System.out.println("Your BMI is " + df.format(bmi));

        if(bmi < 18.5){
            System.out.println("You are underweight. You should see your doctor.");
        }
        else if(bmi > 25){
            System.out.println("You are overweight. You should see your doctor.");
        }
        else {
            System.out.println("You are within the ideal weight range.");
        }
    }

    public static boolean numberOrNot(String input){

        try{
            Integer.parseInt(input);
        }
        catch(NumberFormatException ex)
        {
            return false;
        }
        return true;
    }
}
