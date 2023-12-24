package oop;

public class InitVar {
    int x;
    int y = x;

    void method1(){
        int i;
//        int j = i; // 에러
    }
}
