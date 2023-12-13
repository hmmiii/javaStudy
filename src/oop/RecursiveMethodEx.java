package oop;

public class RecursiveMethodEx {
    public static void main(String[] args) {
        method(3);
    }

    static void method(int n){
        if(n==0)
            return; // n의 값이 0이면, 메서드 종료.
        System.out.println(n);

        method(--n); // 재귀호출. method(int n을 호출)
    }
}
