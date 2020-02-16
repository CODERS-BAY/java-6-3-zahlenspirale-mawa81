package com.codersbay;

public class Main {

    public static void main(String[] args) {
        int n = 5; // max N
        int xs_start = 1;
        int ys_start = 1;
        int xs_end = n;
        int ys_end = n;

        //  int[][] field = new int[n * n][2];
        int[][] field_new = new int[n * n][2];
        int index = 0;

        while (index < n * n) {
            for (int xs = xs_start; xs <= xs_end; xs++) {
                field_new[index][0] = xs;
                field_new[index][1] = xs_start;
/*                System.out.println("i+: " + index);
                System.out.println(field_new[index][0]);
                System.out.println(field_new[index][1]);*/
                index++;
            }
            ys_start++;
            for (int ys = ys_start; ys <= ys_end; ys++) {
                field_new[index][0] = xs_end;
                field_new[index][1] = ys;
/*                System.out.println("i++: " + index);
                System.out.println(field_new[index][0]);
                System.out.println(field_new[index][1]);*/
                index++;
            }
            xs_end--;
            for (int xs = xs_end; xs >= xs_start; xs--) {
                field_new[index][0] = xs;
                field_new[index][1] = ys_end;
/*                System.out.println("i-: " + index);
                System.out.println(field_new[index][0]);
                System.out.println(field_new[index][1]);*/
                index++;
                // System.out.print(xs+" x "+xs_start);
            }
            ys_end--;
            for (int ys = ys_end; ys >= ys_start; ys--) {
                field_new[index][0] = xs_start;
                field_new[index][1] = ys;
/*                System.out.println("i--: " + index);
                System.out.println(field_new[index][0]);
                System.out.println(field_new[index][1]);*/
                //  System.out.print(ys_start+" y "+ys);
                index++;
            }
            xs_start++;
        }
       /* for (int e = 0; e < field_new.length; e++) {
            System.out.println("i " + (e + 1));
            System.out.println(field_new[e][0]);
            System.out.println(field_new[e][1]);
        } */
        // goes through the x and y coordinates, loop through the field array if field x y similar to the loop x y
        for (int y = 1; y <= n; y++) {
            for (int x = 1; x <= n; x++) {
                for (int i = 0; i < field_new.length; i++) {
                    if (field_new[i][0] == x && field_new[i][1] == y) {
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