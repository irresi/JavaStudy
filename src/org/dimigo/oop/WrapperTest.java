package org.dimigo.oop;

public class WrapperTest {
    public static void main(String[] args) {
        //Wrapper 클래스 : Primitive 타입을 Wrapping 해 주는 클래스
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.SIZE);

        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.toHexString(10));
        System.out.println(Integer.toOctalString(10));

        // Boxing (Primitive -> Wrapper)
        Integer i1 = new Integer(100);
        Integer i2 = new Integer("100");

        System.out.println(i1.equals(i2));

        Integer i3 = Integer.valueOf(200);
        Integer i4 = Integer.valueOf("200");
        Double d1 = Double.valueOf(3.14);

        //Unboxing (Wrapper -> Primitive)
        int r1 = i1.intValue();
        double r2 = d1.doubleValue();

        //문자열 -> 해당되는 Primitive Type
        int r3 = Integer.parseInt("300");
        double r4 = Double.parseDouble("3.14");
        System.out.println(r3+r4);

        //100 + 200
        System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[1]));


        Integer obj1 = new Integer(1000);
        Integer obj2 = new Integer(2000);
        System.out.println(obj1+obj2);

        Integer a = 1000;
        int b = a+100;

        //Autoboxing, Autounboxing 몇 번? 3+3
        Integer c = 10;
        Integer d = c+10;
        Integer result = c+d;

    }
}
