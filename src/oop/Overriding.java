package oop;

class Point{
    int x;
    int y;

    String getLocation(){
        return "x : " + x + ", y : " + y;
    }
}

class Point3D extends Point{
    int z;

    String getLocation(){
        return "x : " + x + ", y : " + y + ", z : " + z;
    }
}

public class Overriding {
    public static void main(String[] args) {

    }
}
