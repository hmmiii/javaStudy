package oop;

public class FactorialTest4 {
    public static void main(String[] args) {
        int result = factorial(4);

        System.out.println(result);
    }

    static int factorial(int n){
        int result = 1;
        while (n!=0)
            result *= n--;
        return result;
    }
}
