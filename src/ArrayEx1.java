public class ArrayEx1 {
    public static void main(String[] args) {

        int sum = 0; // 총점
        float avg = 0f; // 평균

        int[] scoreArr = {100, 88, 100, 100, 90};

        for(int score : scoreArr){
            sum += score;
        }

        avg = sum / (float)scoreArr.length; // 계산 결과를 float로 얻기 위해 형변환.

        System.out.println("총점 : "+sum);
        System.out.println("평균 : "+avg);

    }

}
