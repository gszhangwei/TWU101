package com.zw.assignment;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arthur.w on 2016/6/2.
 */
public class TriangleExercises {
    public void printTest() {
        System.out.print("*");
    }

    public void DrawHorizontalLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }

    public void DrawVerticalLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
    }

    public void DrawRightTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    @Test
    public void IsoscelesTriangle() {
        for (int i = 0; i < 3; i++) {
            for (int j = 2; j > i; j--) {
                System.out.print(" ");
            }
            for (int m = 0; m < 2 * i + 1; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    @Test
    public void Diamond() {
        int n=4;
        for (int i = 0; i < n; i++) {
            if (i == n-1) {
                System.out.println("Bill");
                break;
            }
            for (int j = n-1; j > i; j--) {
                System.out.print(" ");
            }
            for (int m = 0; m < 2 * i + 1; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n-1; i > 0; i--) {
            for (int j = n-1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int m = 2 * i - 1; m > 0; m--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    @Test
    public void FizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }

    //  PrimeFactors
    @Test
    public void generate() {
        List<Integer> list = new ArrayList<Integer>();
        int n = 30;
        for (int i = 2; i <= n; i++) {
            while (n != i) {
                if(n%i != 0){
                    break;
                }
                list.add(Integer.valueOf(i));
                n=n/i;
            }
        }
        list.add(Integer.valueOf(n));
        String s=list.toString();
        System.out.print(s);
    }
}
