//package org.dimigo.oop;
//
//public class Calculator2 {
//    //인스턴스 메소드
//    public static void powerOn(boolean powerFlag){
//        if(!powerFlag) {
//            System.out.println("전원을 켭니다.");
//            powerFlag = true;
//        }
//    }
//    public static void powerOff(boolean powerFlag){
//        if(powerFlag) {
//            System.out.println("전원을 끕니다.");
//            powerFlag = false;
//        }
//    }
//    public static int add(int num1, int num2, Calculator2 c){
//        c.powerOn();
//        return num1+num2;
//    }
//    public static int sub(int num1, int num2, Calculator2 c){
//        c.powerOn();
//        return num1-num2;
//    }
//    public static int mul(int num1, int num2, Calculator2 c){
//        c.powerOn();
//        return num1*num2;
//    }
//    public static double div(int num1, int num2, Calculator2 c){
//        c.powerOn();
//        return (double)num1/num2;
//    }
//}
