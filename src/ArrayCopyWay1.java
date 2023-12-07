import java.util.*;

public class ArrayCopyWay1 {
    public static void main(String[] args) {
        int[] intArr = {10, 20, 30, 40, 50};
        System.out.println(intArr); // [I@a09ee92
        System.out.println(Arrays.toString(intArr)); // [10, 20, 30, 40, 50]


        int[] tmpArr = new int[intArr.length*2]; // 기본 배열보다 2배 긴 배열 생성

        for (int i = 0; i < intArr.length; i++) {
            tmpArr[i] = intArr[i];
        }

        intArr = tmpArr; // 참조변수 intArr이 새로운 배열을 가르키도록 한다.

        System.out.println(intArr); // [I@30f39991
        System.out.println(Arrays.toString(intArr)); // [10, 20, 30, 40, 50, 0, 0, 0, 0, 0]
    }
}
