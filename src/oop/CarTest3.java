package oop;

class Car3{
    String color; // 색상
    String gearType; // 변속기 종류 - auto(자동), manual(수동)
    int door; // 문 개수

    Car3(){
        this("white", "auto", 4);
    }

    Car3(Car3 c){ // 인스턴스 복사를 위한 생성자
        this.color = c.color;
        this.gearType = c.gearType;
        this.door = c.door;
    }


    Car3(String c, String g, int d){ // 생성자
        color = c;
        gearType = g;
        door = d;
    }
}

public class CarTest3 {
    public static void main(String[] args) {
        Car3 c1 = new Car3();

        Car3 c2 = new Car3(c1);

        System.out.println("c1의 color = " + c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);
        System.out.println("c2의 color = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);
    }
}
