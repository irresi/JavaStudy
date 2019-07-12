package org.dimigo.basic;

public class Operator {
    public static void main(String[] args) {
/*        int a=5, b=2;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println((double)a/b);
        System.out.println(a*1.0 / b);

        int i=10;
        double d=3.14;
        int r = (int)(i + d);
        double r2= i + d;

        short s1 = 1, s2 = 2;
        short r3 = (short)(s1 + s2);
        int r4 = s1 + s2;
        // Short - Circuit
        boolean flag= true;

        if(flag | (10 / 0 ==0)) {
            System.out.println("OR 연산");
        }
*/
        //문자열 연결 연산자
        String School = "디미고";
        int Grade = 2;
        int Class = 6;
        String Name = "이재환";

        System.out.println(School + Grade + Class + Name);
        System.out.println("" +  Grade + Class + School + Name);
    }
}
