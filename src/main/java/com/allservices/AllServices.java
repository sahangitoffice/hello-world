package com.allservices;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Methods for all services
 * Created by hsenid on 9/23/16.
 */
public class AllServices {
    /**
     * egs pattern print
     */
    public static void ex1() {
        int i, j;
        for (i = 1; i <= 10; i++) {
            for (j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void ex2() {
        int i;
        int j;
        i = 1;
        j = 0;

        while (i <= 10) {
            while (j < i) {
                System.out.print("*");
                j++;
            }
            i++;
            j = 0;
            System.out.println();
        }
    }

    /**
     * patterns ans for question 1
     */
    public static void ex3() {
        int i;
        int j;
        for (i = 1; i <= 10; i++) {
            for (j = 1; j <= 10; j++) {
                if (j > 10 - i) {
                    System.out.print("*");

                } else {
                    System.out.print("#");
                }
            }
            System.out.println("");
        }
    }

    /**
     * patterns ans for question 2
     */
    public static void ex4() {
        int i;
        int j;
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5 - i; j++) {
                System.out.print("#");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("$ ");
            }
            System.out.println();
        }
    }

    public static void ex5() {
        int i;
        int j;
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5 - i; j++) {
                /*
                if(5-i>j){
                    System.out.print("#");
                }else {
                    System.out.print("$");
                }
                */
                System.out.print("#");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("$ ");
            }
            System.out.println("");
        }
    }

    public static void ex6() {
        int i;
        int j;
        for (i = 20; i > 0; i--) {
            for (j = 0; j < 20 - i; j++) {

                if (j < i - 1) {
                    System.out.print("#");
                } else {
                    System.out.print("$");
                }
                //System.out.print("#");
            }
            System.out.println("");
        }
    }

    public static void ex7() {
        int i;
        int j;
        int k;
        for (i = 1; i <= 5; i++) {
            for (j = 4; j >= i; j--) {
                System.out.print("#");
            }
            for (k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    /**
     * patterns ans for question 3
     */
    public static void ex8() {
        int e;
        for (int a = -5; a <= 5; a++) {
            if (a < 0)
                e = -a;
            else
                e = a;
            int c = 5 - e;
            for (int d = 0; d <= 5 + c; d++) {
                if (d < e)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void ex9() {
        int i;
        int j;
        for (i = 0; i < 10; i++) {
            for (j = 10; j > 10 - i; j--) {

                if (j > i + 1) {
                    System.out.print("#");
                } else {
                    System.out.print("$");
                }
                //System.out.print("#");
            }
            System.out.println("");
        }
        for (i = 10; i > 0; i--) {
            for (j = 10; j > 10 - i; j--) {

                if (j > i + 1) {
                    System.out.print("#");
                } else {
                    System.out.print("$");
                }
                //System.out.print("#");
            }
            System.out.println("");
        }
    }

    public static void ex10() {
        int i;
        int j;
        int k;
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5 - i; j++) {
                System.out.print("#");
            }
            for (k = 0; k <= i; k++) {
                System.out.print("$ ");
            }
            System.out.println();
        }
        for (i = 5; i > 0; i--) {
            for (j = 0; j < 5 - i; j++) {
                System.out.print("#");
            }
            for (k = 0; k <= i; k++) {
                System.out.print("$ ");
            }
            System.out.println();
        }
    }

    /**
     * patterns ans for question 4
     */
    public static void ex11() {
        int i;
        int j;
        for (i = 2; i <= 21; i++) {
            for (j = 1; j < i; j++) {
                if (j > 10) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void ex12() {
        int i;
        int j;
        for (i = 2; i <= 11; i++) {
            System.out.print("--------------------");
            for (j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * patterns ans for question 5
     */
    public static void ex13() {
        int i;
        int j;
        for (i = 1; i <= 10; i++) {
            System.out.print("-----------------");
            for (j = 1; j <= 10; j++) {
                if (j > 10 - i) {
                    System.out.print("*");

                } else {
                    System.out.print("#");
                }
            }
            System.out.println("");
        }
    }

    /**
     * patterns ans for question 6
     */
    public static void ex14() {
        int i;
        int j;
        int a = 0;
        while (a < 2) {
            for (i = 1; i <= 10; i++) {
                for (j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            a++;
        }
    }

    public static void ex15() {
        int i;
        int j;
        for (i = 1; i <= 10; i++) {
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * patterns ans
     */
    public static void method1(int y, int x) {
        for (int i = 0; i < y; i++) {
            if(i%2==0) {
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }

        System.out.println();

        for (int i = 0; i < x - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < y - 2; j++) {
                System.out.print("#");
            }
            System.out.println("*");
        }

        for (int i = 0; i < y; i++) {
            if(i%2==0) {
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    /**
     * patterns ans
     */
    public static void method2(int y, int x) {
        for (int i = 0; i < x; i++) {
            System.out.print("*");
            for (int j = 0; j < y; j++) {
                if(i==0 || i==(x-1)) {
                    if(j%2==0) {
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("*");
        }
    }
    /**
     * patterns ans
     */
    public static void method3(int m) {
        for (int a = 0; a < m; a++) {
            System.out.print("*");
            for (int b = 0; b < m; b++) {
                if (a == 0 || a == m - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("*");
        }
    }
    /**
     * patterns ans
     */
    public static void method4(int y, int x) {
        for (int i = 0; i < y; i++) {
            if(i%2==0) {
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }

        System.out.println();

        for (int i = 0; i < x - 2; i++) {
            System.out.print(" ");
            for (int j = 0; j < y - 2; j++) {
                if(j==i) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

        for (int i = 0; i < y; i++) {
            if(i%2==0) {
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    /**
     * patterns ans
     */
    public static void method5(int n) {
        for (int a = 0; a < n; a++) {
            for (int b = 0; b < n; b++) {
                if (a == 0 || a == n - 1 || b == a) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    /**
     * patterns ans
     */
    public static void method6(int n) {
        for (int a = 0; a < n; a++) {
            for (int b = 0; b < n; b++) {
                if (a == 0 || a == n - 1 || b == n-1-a) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    /**
     * patterns ans
     */
    public static void method7(int n) {
        for (int a = 0; a < n; a++) {
            for (int b = 0; b < n; b++) {
                if (a == 0 || a == n - 1 || b == n-1-a || a == b) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    /**
     * patterns ans
     */
    public static void method8(int n) {
        for (int a = 0; a < n; a++) {
            System.out.print("*");
            for (int b = 0; b < n; b++) {
                if (a == 0 || a == n - 1 || b == n-1-a || a == b) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("*");
        }
    }

    /**
     * Method for infinite loop
     */
    public static void infinite(){

        String text;

        label1:
        for (; ; ) {
            //System.out.println("print");
            System.out.println("Enter exit to break infinite loop");
            Scanner sc = new Scanner(System.in);
            text = sc.next();

            if (text.equals("exit")) {
                break label1;
            }
        }
    }

    /**
     * Method to print multiplication table up to 12
     */
    public static void multiplicationMethod() {
        int i;
        int j;

        for(i=0;i<=12;i++)
        {
            for(j=0;j<=12;j++)
            {
                //System.out.println(i+"*"+j+" = "+(i*j)+"\t");
                System.out.print(i + "X" + j + "= "+"\t"+ i*j + "\t"+"||"+"\t" );
            }
            System.out.println();
        }
    }

    /**
     * Method to calculate factorial of given number
     */
    public static void factorialMethod() {
        int num;
        BigInteger bi = new BigInteger("1");

        System.out.println("Enter a number to get Factorial:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        if (num < 0) {
            System.out.println("Invalid number!");
            System.exit(1);
        }
        for (int i = 1; i < num; i++) {
            bi = bi.multiply(BigInteger.valueOf(i));
        }

        System.out.println("Factorial of " + num + " is : " + bi);
    }

    /**
     * Method to create fibonnaci series
     */
    public static void fibonacciMethod() {
        int number;

        System.out.println("Enter a number to get Fibonacci Series:");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        BigInteger[] series = new BigInteger[number];


        for (int x = 0; x < number; x++) {
            if(x <= 1)
            {
                if(x == 1)
                    series[x] = BigInteger.valueOf(1L);
                if(x == 0)
                    series[x] = BigInteger.valueOf(0L);
            }

            else
                series[x] = series[x - 1].add(series[x - 2]);
        }
        for (int j = 0; j < series.length; j++) {

            System.out.print(series[j] +",");
        }
        System.out.println();
    }
    /**
     * Method to print pattern using twodimensional array
     */
    public static void multiDimenPrint() {
        int i, j;
        String twoDm[][]= new String[10][10];

        for (i = 1; i <= 10; i++) {
            for (j = 1; j < i; j++) {
                twoDm[i][j] = "#";
                System.out.print(twoDm[i][j]);
            }
            System.out.println();
        }
    }

}
