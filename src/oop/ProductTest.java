package oop;

public class ProductTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        Xbox x = new Xbox();
        Audio a = new Audio();

        System.out.println(x.toString()); // xbox

        b.buy(x);
        b.buy(a);
    }
}

class Product{
    int price; // 제품 가격
    int bonusPoint; // 제품구매시 제공되는 보너스 점수

    Product(int price){
        this.price = price;
        bonusPoint = (int) (price/10.0); // 보너스점수는 제품 가격의 10%
    }
}

class Xbox extends Product{
    Xbox(){
        // 조상클래스의 생성자 Product(int price)를 호출
        super(100); //Xbox의 가격은 100
    }

    // Object 클래스의 toString()을 오버라이팅
    public String toString(){ return "Xbox"; }
}
class Computer extends Product{
    Computer(){
        // 조상클래스의 생성자 Product(int price)를 호출
        super(200); //Computer의 가격은 100
    }

    // Object 클래스의 toString()을 오버라이팅
    public String toString(){ return "Computer"; }
}
class Audio extends Product{
    Audio(){
        // 조상클래스의 생성자 Product(int price)를 호출
        super(300); //Audio의 가격은 100
    }

    // Object 클래스의 toString()을 오버라이팅
    public String toString(){ return "Audio"; }
}

class Buyer{
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product p){
        // Buyer가 가진 돈에서 제품의 가격만큼 뺀다.
        money -= p.price;

        // Buyer의 보너스점수에 제품의 보너스점수를 더한다.
        bonusPoint += p.bonusPoint;
    }
}