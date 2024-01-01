package oop;

class Point{
    int x;
    int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    String getLocation(){
        return "x : " + x + ", y : " + y;
    }
}

class Point3D extends Point{
    int z;

    Point3D(int x, int y, int z){
        super(x, y);
        this.z = z;
    }

    String getLocation(){
//        return "x : " + x + ", y : " + y + ", z : " + z;
        return super.getLocation() + ", z : " + z; // 조상 메서드 호출
    }
}

public class Overriding {
    public static void main(String[] args) {
        Point3D p3 = new Point3D(10, 10, 10);
    }
}
