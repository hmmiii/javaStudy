package oop;

public class CallStackTest {
    public static void main(String[] args) {
        firstMethod();
    }

    static void firstMethod(){
        System.out.println("firstMethod() 시작");
        secondMethod();
        System.out.println("firstMethod() 종료");
    }

    static void secondMethod(){
        System.out.println("secondMethod() 시작");
        System.out.println("secondMethod() 종료");
    }

}

/*
출력

firstMethod() 시작
secondMethod() 시작
secondMethod() 종료
firstMethod() 종료
*/
