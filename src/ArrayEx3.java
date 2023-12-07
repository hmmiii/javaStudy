public class ArrayEx3 {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = i;
            System.out.print(numArr[i]);
        }

        System.out.println();

        for (int i = 0; i < numArr.length; i++) {
            int n = (int) (Math.random() * 10); // 0~9 중의 값을 임의로 얻음
            int tmp = numArr[i];
            numArr[i] = numArr[n];
            numArr[n] = tmp;
        }

        for(int num : numArr){
            System.out.print(num);
        }
    }
}
