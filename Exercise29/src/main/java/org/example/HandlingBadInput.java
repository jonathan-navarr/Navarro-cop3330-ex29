package org.example;
import java.util.Scanner;
import java.util.InputMismatchException;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

public class HandlingBadInput {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int rateofReturn ;

        boolean done = false;
        while (!done) {
            System.out.print("What is the rate of return: ");
            try {
                rateofReturn = scnr.nextInt();
                if (rateofReturn == 0) {
                    System.out.println("Sorry. That's not a valid input.");
                    done = false;
                }
                else {
                    rateofReturn = 72/rateofReturn;
                    System.out.println("It will take " + rateofReturn + " years to double your initial investment.");
                    done = true;
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Sorry. That's not a valid input.");
                scnr.nextLine();
                done = false;
            }
        }


    }
}


