/*
Objective:
In this challenge, we're going to use loops to help us do some simple math.

Task:
Given an integer, , print its first  multiples. Each multiple  (where ) should be printed on a new line in the form: N x i = result.

Input Format:
A single integer, N.

Constraints:
2 <= N <= 20

Output Format:
Print  lines of output; each line i (where 1 <= i <= N) contains the result of N x i in the form:
N x i = result.

Sample Input:
2

Sample Output:
2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20
 */

package com.easy;

import java.util.Scanner;

public class Solution06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(N + " x " + i + " = " + N * i);
        }

        sc.close();
    }
}
