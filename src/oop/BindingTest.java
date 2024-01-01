package oop;

public class BindingTest {
    public static void main(String[] args) {
        BindingParent p = new BindingChild();
        BindingChild c = new BindingChild();

        System.out.println("p.x = " + p.x);
        p.method();
        System.out.println("c.x = " + c.x);
        c.method();
    }
}

class BindingParent{
    int x = 100;

    void method(){
        System.out.println("Parent Method");
    }
}

class BindingChild extends BindingParent{
    int x = 200;

    void method(){
        System.out.println("Child Method");
    }
}