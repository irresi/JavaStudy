package org.dimigo.inheritance2;

public class PersonTest {
    public static void main(String[] args) {
        Person Tom=new Person("Tom");
        Korean Hong=new Korean("홍길동");
        Japanese Da=new Japanese("다나카");
        Chinese Wang=new Chinese("왕밍");
        System.out.println(Tom.toString());
        System.out.println(Hong.toString());
        System.out.println(Da.toString());
        System.out.println(Wang.toString());
        System.out.println();
        Tom.sayHello();
        Hong.sayHello();
        Da.sayHello();
        Wang.sayHello();
        System.out.println();
        Tom.sayBye();
        Hong.sayBye();
        Da.sayBye();
        Wang.sayBye();
    }
}
