/* Exercise 37
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Monil_Patel
 */
package oop.assignment2.ex37;

import java.lang.String;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.*;

public class Solution37
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        System.out.print("What's the minimum length? ");
        int size = Integer.parseInt(input.nextLine());

        System.out.print("How many special characters? ");
        int special = Integer.parseInt(input.nextLine());

        System.out.print("How many numbers? ");
        int numbers = Integer.parseInt(input.nextLine());

        System.out.println("Your password is " + generatePassword(size, special, numbers));
    }


    public static String generatePassword(int length, int special, int nums)
    {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        String specialCharacters = "!@#$%^&*";

        String numbers = "1234567890";

        Random random = new Random();

        ArrayList<Character> chars = new ArrayList<>();

        for(int i = 0; i < special; i++)
        {
            chars.add(specialCharacters.charAt(random.nextInt(specialCharacters.length())));
        }


        for(int i = 0; i < nums; i++)
        {
            chars.add(numbers.charAt(random.nextInt(numbers.length())));
        }


        for(int i = chars.size() - 1; i <length; i++)
        {
            chars.add(letters.charAt(random.nextInt(letters.length())));
        }


        Collections.shuffle(chars);
        String password = "";
        for(Character s : chars)
        {
            password += Character.toString(s);
        }

        return password;
    }
}