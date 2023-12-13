package oop;

public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time();
        t.setHour(1);
        t.setMinute(20);
        t.setSecond(30.34f);
        System.out.println(t.getHour() + ":" + t.getMinute() + ":" + t.getSecond());
    }
}
