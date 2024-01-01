package oop;

class Car4{
    String color;
    int door;
    void drive(){
        System.out.println(1);
    }
    void stop(){
        System.out.println(1);
    }
}

class FireEngine extends Car4{
    void water(){
        System.out.println(1);
    }
}

class Ambulance extends Car4{
    void siren(){
        System.out.println(1);
    }
}
public class refcastingTest {
    public static void main(String[] args) {
        Integer intValue = 10;
        double dobuleValue = 10.2;

//        intValue = dobuleValue; // 에러
        intValue = (int) dobuleValue; // 정상
//        dobuleValue = intValue; // 정상
        System.out.println(intValue);

        Car4 c;
        Car4 c2 = null;
        FireEngine f = new FireEngine();
        FireEngine f2;

        c2 = f;
        f2 = (FireEngine) c2;

    }
}
