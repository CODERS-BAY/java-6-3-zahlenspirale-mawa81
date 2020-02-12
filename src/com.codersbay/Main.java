package com.codersbay;

public class Main {

    public static void main(String[] args) {
        int n = 4; // max N
        //int x = 1;
       // int y= 1;
        int[][] field = new int[n*n][2];
        int[][] field_new = new int[n*n][2];
        int index = 0;
        //this_xy = field[index][x][y];

        for(int y = 1; y <= n; y++){
            for(int x = 1; x <= n; x++){
                System.out.print(x+""+y+" ");
                field[index][1] = x;
                index++;
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