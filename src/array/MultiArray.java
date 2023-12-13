package array;

import java.util.Arrays;

public class MultiArray {
    public static void main(String[] args) {
        int[][] numArr = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println(Arrays.deepToString(numArr));

        int[][] numArr2;
        numArr2 = new int[2][3];

        for (int i = 0; i < numArr2.length; i++) {
            for (int j = 0; j < numArr2[i].length; j++) {
                numArr2[i][j] = 10;
            }
        }

        System.out.println(Arrays.deepToString(numArr2));

        for (int[] scoreArr : numArr){
            for(int score : scoreArr){
                System.out.print(score);
            }
        }
        System.out.println();

    }

}
