package org.dimigo.oop;

public class CarTest3 {
    public static void main(String[] args) {
        Car3 car1= new Car3("현대자동차","제네시스","검정색",225,50000000);
        Car3 car2= new Car3("기아자동차","K7","흰색",246);
        Car3 car3= new Car3("삼성자동차","SM7","회색");
        System.out.println("<< 자동차 목록 >>");
        car1.pr();
        car2.pr();
        car3.pr();
    }
}
