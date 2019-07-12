package org.dimigo.inheritance2;

public class PersonTest2 {
    public static void main(String[] args) {
        Person[] P={
            new Person("Tom"),
            new Korean("홍길동"),
            new Japanese("다나카"),
            new Chinese("왕밍")
        };
        for(Person person : P){
            greeting(person);
        }
    }
    public static void greeting(Person A){
        System.out.println(A);
        A.sayHello();
        A.sayBye();
        System.out.println();
    }
}
