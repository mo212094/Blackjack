package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
    Random random = new Random();

    int computerNum1 = random.nextInt(11);
    int computerNum2 = random.nextInt(11);
    int userNum1 = random.nextInt(11);
    int userNum2 = random.nextInt( 11);

    int userTotal = userNum1 + userNum2;

    System.out.println("Your numbers are " + userNum1 + " and " + userNum2 + "\nThey equal " + userTotal);
    System.out.println("Would you like to add another? Y/N");

    String answer = input.next();

    if (answer.contains("y") || answer.contains("Y")){
        int newNum = random.nextInt(11)
        userTotal = userTotal + ;
        System.out.println("Your new number is:" + newNum);
    }


    }
}
