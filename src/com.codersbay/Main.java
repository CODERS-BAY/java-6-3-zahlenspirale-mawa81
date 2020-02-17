package com.codersbay;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean scannerGotInt = false;
        int n = 0; // max N
        do {
            System.out.println("Gib bitte eine positive Ganzzahl (größer als 1) ein:");
            if (scan.hasNextInt()) {
                n = scan.nextInt();
                if (n > 1) {
                    scannerGotInt = true;
                }
            } else {
                System.out.println("Falsche Eingabe!");
                scan.next();
            }
        }
        while (!scannerGotInt);

        int xsStart = 1;
        int ysStart = 1;
        int xsEnd = n;
        int ysEnd = n;

        //  int[][] field = new int[n * n][2];
        int[][] fieldNew = new int[n * n][2];
        int index = 0;

        while (index < n * n) {
            for (int xs = xsStart; xs <= xsEnd; xs++) {
                fieldNew[index][0] = xs;
                fieldNew[index][1] = xsStart;
/*                System.out.println("i+: " + index);
                System.out.println(field_new[index][0]);
                System.out.println(field_new[index][1]);*/
                index++;
            }
            ysStart++;
            for (int ys = ysStart; ys <= ysEnd; ys++) {
                fieldNew[index][0] = xsEnd;
                fieldNew[index][1] = ys;
/*                System.out.println("i++: " + index);
                System.out.println(field_new[index][0]);
                System.out.println(field_new[index][1]);*/
                index++;
            }
            xsEnd--;
            for (int xs = xsEnd; xs >= xsStart; xs--) {
                fieldNew[index][0] = xs;
                fieldNew[index][1] = ysEnd;
/*                System.out.println("i-: " + index);
                System.out.println(field_new[index][0]);
                System.out.println(field_new[index][1]);*/
                index++;
                // System.out.print(xs+" x "+xsStart);
            }
            ysEnd--;
            for (int ys = ysEnd; ys >= ysStart; ys--) {
                fieldNew[index][0] = xsStart;
                fieldNew[index][1] = ys;
/*                System.out.println("i--: " + index);
                System.out.println(field_new[index][0]);
                System.out.println(field_new[index][1]);*/
                //  System.out.print(ysStart+" y "+ys);
                index++;
            }
            xsStart++;
        }
       /* for (int e = 0; e < field_new.length; e++) {
            System.out.println("i " + (e + 1));
            System.out.println(field_new[e][0]);
            System.out.println(field_new[e][1]);
        } */
        System.out.println("Zahlenspirale mit N = " + n);
        System.out.println();
        // goes through the x and y coordinates, loop through the field array if field x y similar to the loop x y
        for (int y = 1; y <= n; y++) {
            for (int x = 1; x <= n; x++) {
                for (int i = 0; i < fieldNew.length; i++) {
                    if (fieldNew[i][0] == x && fieldNew[i][1] == y) {
                        int output = i + 1;
                        System.out.printf("%2d ", output);    //print the index
                    }
                }
            }
            System.out.println();
        }
        /*
            count=1
        x=1 bis x=n
        count++
        y=1
            count=3
        if(x==n)
            x=x
            y+1 bis y==n
        if(y == n)
            y=y.length
            x-1 bis x==1
        */
    }

}