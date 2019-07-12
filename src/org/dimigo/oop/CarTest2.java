package org.dimigo.oop;

public class CarTest2 {
    public static void main(String[] args) {
        Car2 car1= new Car2("현대자동차","제네시스","검정색",225,50000000);
        Car2 car2= new Car2("기아자동차","K7","흰색",246,40000000);
        Car2 car3= new Car2("삼성자동차","SM7","회색",200,38000000);
        System.out.println("<< 자동차 목록 >>");
        car1.pr();
        car2.pr();
        car3.pr();
    }
}
