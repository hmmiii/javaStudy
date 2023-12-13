package array;

public class ArrayEx4 {
    public static void main(String[] args) {
        // 연속적인 값 채우기
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*arr.length);
            System.out.print(arr[i]);
        }
    }
}
