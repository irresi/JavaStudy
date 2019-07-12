package org.dimigo.oop;

public class SnackTest {
    public static void main(String[] args) {
        Snack[] lib={
                new Snack("새우깡","농심",1100,2),
                new Snack("콘칲","크라운",1200,1),
                new Snack("허니버터칩","해태",1500,4)
        };
        System.out.println(lib[0].toString());
        System.out.println(lib[1].toString());
        System.out.println(lib[2].toString());
        System.out.printf("총 구매 금액 : %,d원",lib[0].calcPrice()+lib[1].calcPrice()+lib[2].calcPrice());
    }
}
