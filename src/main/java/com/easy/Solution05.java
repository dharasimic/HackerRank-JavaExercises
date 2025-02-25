/*
Input Format:
Every line of input will contain a String followed by an integer.
Each String will have a maximum of 10 alphabetic characters, and each integer will be in the inclusive range from 0 to 999.

Output Format:
In each line of output there should be two columns:
The first column contains the String and is left justified using exactly 15 characters.
The second column contains the integer, expressed in exactly 3 digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.

Sample Input:

java 100
cpp 65
python 50

Sample Output:

================================
java           100 
cpp            065 
python         050 
================================
Explanation

Each String is left-justified with trailing whitespace through the first 15 characters. The leading digit of the integer is 
the 16th character, and each integer that was less than 3 digits now has leading zeroes.
 */

package com.easy;

import java.util.Scanner;

public class Solution05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] str = new String[3];
        int[] num = new int[3];

            for (int i = 0; i < 3; i++) {
                str[i] = sc.next();
                num[i] = sc.nextInt();
                if (num[i] < 0 || num[i] > 999) {
                    throw new IllegalArgumentException("Number must be between 0 and 999");
                }
            }
                System.out.println("================================");
            for (int i = 0; i < 3; i++) {
                System.out.printf("%-15s%03d%n", str[i], num[i]);
            }
                System.out.println("================================");

        sc.close();
    }
}
