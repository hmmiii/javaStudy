package oop;

class ConstructorData{
    int value;
    ConstructorData(int x){
        value = x;
    }
}
public class ConstructorTest {
    public static void main(String[] args) {
        //    ConstructorData d = new ConstructorData(); // ERR
        ConstructorData d = new ConstructorData(10);
    }

}
