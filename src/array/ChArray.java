package array;

import java.util.Arrays;

public class ChArray {
    public static void main(String[] args) {
        int[][] score = new int[2][];

        score[0] = new int[3];
        score[1] = new int[5];

        System.out.println(Arrays.deepToString(score)); // [[0, 0, 0], [0, 0, 0, 0, 0]]

        int[][] score2 = {
                {100, 100, 100},
                {100, 100, 100, 100, 100}
        };

        System.out.println(Arrays.deepToString(score2)); // [[100, 100, 100], [100, 100, 100, 100, 100]]
    }
}
