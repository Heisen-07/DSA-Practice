package com.vaibhav;

import java.util.ArrayList;
import java.util.Collections;

public class Maxvaluehard {
    public static void main(String[] args) {
        int[][] a={{1,3},{2,0},{5,10},{6,-10}};
        int k=1;
        solved(a,k);
    }
    static void solved(int[][] a, int k) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for(int row=0;row<a.length-1;row++) {
            int sum1=-100;
            for(int l=row+1;l<row+3;l++) {
                if(Math.abs(a[row][0]-a[l][0])<=k) {

                    sum1=a[row][1]+a[l][1]+Math.abs(a[row][0]-a[l][0]);
                    arrayList.add(sum1);
                }
            }

        }
        int i=Collections.max(arrayList);
        System.out.println(i);
        //TLE
    }
}
