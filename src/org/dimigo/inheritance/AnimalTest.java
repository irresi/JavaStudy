package org.dimigo.inheritance;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a=new Animal("아무개");
        System.out.println(a);
        a.eat();
        a.sleep();
        a.bark();

        Dog d= new Dog("멍멍이");
        System.out.println(d);
        d.eat();
        d.sleep();
        d.bark();
        d.wag();

        Cat c = new Cat("야옹이");
        System.out.println(c);
        c.bark();       // Cat의 bark()
        c.scratch();

        Tiger t = new Tiger("호돌이");
        System.out.println(t.toString());
        t.bark();
        t.hunt();

        System.out.println("_____________________");
        Animal[] animals = {
                new Dog("멍멍이"),
                new Cat("야옹이"),
                new Tiger("호돌이")
        };

        for (Animal animal: animals ) {
            doBark(animal);
        }
        Animal a2= new Cat("야옹이");
        a2.eat();
        a2.sleep();
        a2.bark();
        ((Cat)a2).scratch();
        //Dog d2 = (Dog)a2;

        Animal dog = new Dog("멍멍이");
        Animal cat = new Cat("야옹이");

        System.out.println(dog instanceof Dog);
        System.out.println(cat instanceof Cat);
        System.out.println(dog instanceof Cat);
        System.out.println(cat instanceof Dog);
        System.out.println(dog instanceof Animal);
        System.out.println(cat instanceof Animal);
        //System.out.println(dog instanceof Object);

        doBark(dog);
        doBark(cat);
    }

    private static void doBark(Animal animal) {
        if(animal instanceof Dog) ((Dog)animal).wag();
        else if(animal instanceof Cat) ((Cat)animal).scratch();
    }
}
