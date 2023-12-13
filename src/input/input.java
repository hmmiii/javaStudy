package input;

import java.util.*;
public class input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("원하는 정수를 입력하세요 : ");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);
        System.out.printf("입력한 정수 : %d%n", num);
    }
}
