package variable;

public class typecast {
    public static void main(String[] args) {
        int intA = (int)'A';
        char charA = (char)intA;
        System.out.println(intA); // 65
        System.out.println(charA); // 'A'
        System.out.println(intA); // 65
    }
}
