public class ArrayEx2 {
    public static void main(String[] args) {
        int[] scoreArr = {79, 88, 91, 3, 100, 55, 95};

        int min = scoreArr[0];
        int max = scoreArr[0];

        for(int score : scoreArr){
            if(min > score){
                min = score;
            }else if(max < score){
                max = score;
            }
        }

        System.out.printf("최소값 : %d, 최대값 : %d%n",min,max);
    }
}
