/*Exercise 28
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
/* Exercise 28
     *  UCF COP3330 Fall 2021 Assignment 2 Solution
     *  Copyright 2021 Monil_Patel
     */
package ex28;
import java.util.Scanner;

public class Calculate Total {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            total += in.nextInt();
        }
        System.out.println("The total is " + total + ".");
    }
}