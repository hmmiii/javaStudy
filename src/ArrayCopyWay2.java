import java.util.Arrays;

public class ArrayCopyWay2 {
    public static void main(String[] args) {
        int[] intArr = {10, 20, 30, 40, 50};
        System.out.println(intArr); // [I@a09ee92
        System.out.println(Arrays.toString(intArr)); // [10, 20, 30, 40, 50]


        int[] tmpArr = new int[intArr.length*2]; // 기본 배열보다 2배 긴 배열 생성

        System.arraycopy(intArr, 0, tmpArr, intArr.length, intArr.length); // arraycopy이용.

        intArr = tmpArr; // 참조변수 intArr이 새로운 배열을 가르키도록 한다.

        System.out.println(intArr); // [I@30f39991
        System.out.println(Arrays.toString(intArr)); // [0, 0, 0, 0, 0, 10, 20, 30, 40, 50]
    }
}
