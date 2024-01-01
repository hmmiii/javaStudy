package oop;
import java.util.*;

import java.util.Vector;

public class ProductTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        Xbox x = new Xbox();
        Audio a = new Audio();

        System.out.println(x.toString()); // xbox

        b.buy(x);
        b.buy(a);

        b.summary();
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
    Vector item = new Vector(); // 구입한 제품을 저장하기 위한 배열
    int i = 0;


    void buy(Product p){
        if (money < p.price){
            System.out.println("잔액이 부족하여 구매 불가합니다.");
            return;
        }

        // Buyer가 가진 돈에서 제품의 가격만큼 뺀다.
        money -= p.price;

        // Buyer의 보너스점수에 제품의 보너스점수를 더한다.
        bonusPoint += p.bonusPoint;
        item.add(p);
        System.out.println(p + " 을 구매하셨습니다.");
    }

    void refund(Product p){ // 구입한 제품을 환불한다.
        if (item.remove(p)){ // 제품을 Vector에서 제거한다.
            money += p.price;
            bonusPoint -= p.bonusPoint;
            System.out.println(p + " 을 반품하셨습니다.");
        }else{ // 제거에 실패한 경우
            System.out.println("구입한 제품 중 해당 제품이 없습니다.");
        }
    }

    void summary(){ // 구입한 물품에 대한 정보를 요약해서 보여준다.
        int sum = 0; // 구입한 물품의 합계
        String itemList = ""; // 구입한 물품목록

        if (item.isEmpty()){ // Vector 비어있는지 확인한다.
            System.out.println("구입한 제품이 없습니다.");
            return;
        }

        // 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
        for (int i = 0; i < item.size() ; i++) {
            Product p = (Product) item.get(i); // Vector 객체의 i번째에 있는 객체를 얻어온다.
            sum += p.price;
            itemList += (i==0) ? "" + p : " , " + p;
        }
        System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
        System.out.println("구입하신 물품은 " + itemList + "입니다.");

    }
}