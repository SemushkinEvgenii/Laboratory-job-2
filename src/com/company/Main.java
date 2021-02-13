// var 17
package com.company;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        double s = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number >= 1 - ");
        double n = in.nextInt();
        if(n >= 1) {
            for(int i = 1; i <= n; i++) {
                s = Math.pow((2 * n + 1), 2);
                System.out.print(1 / s);
            }
        }
        else {
            System.out.print("You enter number < 1");
        }

            }
        }