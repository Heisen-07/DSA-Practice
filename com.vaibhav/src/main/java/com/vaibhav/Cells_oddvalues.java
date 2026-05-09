package com.vaibhav;

public class Cells_oddvalues {

    public int oddCells(int m, int n, int[][] indices) {

        int[] rows = new int[m];
        int[] cols = new int[n];

        for (int[] index : indices) {
            rows[index[0]]++;
            cols[index[1]]++;
        }

        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((rows[i] + cols[j]) % 2 != 0) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Cells_oddvalues obj = new Cells_oddvalues();

        int m = 2;
        int n = 3;

        int[][] indices = {
                {0, 1},
                {1, 1}
        };

        System.out.println(obj.oddCells(m, n, indices));
    }
}
