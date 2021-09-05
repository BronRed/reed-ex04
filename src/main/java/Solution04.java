/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brian Reed
 */

import java.util.Scanner;

public class Solution04 {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        //Prompt user for a noun
        //Prompt user for a verb
        //Prompt user for an adjective
        //Prompt user for an adverb
        //Prompt user for etc.
        //Print short story with String.format
        String person1, adj1, adj2, adj3, adj4, noun1, noun2, verb1, verb2, adv1;
        System.out.print("Enter a person: ");
        person1 = scan.nextLine();
        System.out.print("Enter an adjective: ");
        adj1 = scan.nextLine();
        System.out.print("Enter an adjective: ");
        adj2 = scan.nextLine();
        System.out.print("Enter a noun: ");
        noun1 = scan.nextLine();
        System.out.print("Enter an adjective: ");
        adj3 = scan.nextLine();
        System.out.print("Enter a noun: ");
        noun2 = scan.nextLine();
        System.out.print("Enter an adjective: ");
        adj4 = scan.nextLine();
        System.out.print("Enter a verb: ");
        verb1 = scan.nextLine();
        System.out.print("Enter an adverb: ");
        adv1 = scan.nextLine();
        System.out.print("Enter a verb in the past-tense: ");
        verb2 = scan.nextLine();
        String output = String.format("Yesterday, %s and I went to the park. \nOn our way to the %s park, " +
                "we saw a %s %s on a bike. \nWe also saw big %s balloons tied to a %s. \nOnce we got to the %s park, the sky turned %s. " +
                "\nIt started to %s %s. \n%s and I %s all the way home. \nTomorrow we will try to go to the " +
                "%s park again and hope it doesn't %s.", person1, adj1, adj2, noun1, adj3, noun2, adj1, adj4, verb1, adv1,
                person1, verb2, adj1, verb1);
        System.out.println(output);
    }
}
