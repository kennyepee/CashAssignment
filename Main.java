package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);
        float dollars = 0.0f;
        do {
            System.out.print("Change owed: ");
            dollars = keys.nextFloat();
        } while (dollars < 0.0);

        int cents = Math.round(dollars * 100);

        int extra = 0;
        int count = 0;

       if (cents / 25 >= 1) {
           count = (int) Math.floor(cents/25);
           extra = cents % 25; }
       else if (cents /10 >= 1) {
           count = (int) Math.floor(cents/10);
           extra = cents % 10; }
       else if (cents / 5 >= 1) {
           count = (int) Math.floor(cents/5);
           extra = cents % 5;
       } else {
           count = cents;
       }
       int extra1 = 0;
       if (extra/10 >= 1) {
           count += (int) Math.floor(extra/10);
           extra1 = extra % 10; }
       else if (extra / 5 >= 1) {
           count += (int) Math.floor(extra/5);
           extra1 = extra % 5;
       } else {
           count += extra;
       }

       int extra2 = 0;
        if (extra1 / 5 >= 1) {
            count += (int) Math.floor(extra1/5);
            extra2 = extra1 % 5;
        } else {
            count += extra1;
        }

        if (extra2 > 0) {
            count += extra2;
        }
        System.out.println(count + " coins");

    }
    }
