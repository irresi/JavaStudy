//package org.dimigo.oop;
//
//public class ArrayBasic {
//    public static void main(String[] args) {
//        //기본형 타입 배열
//        //int, long, boolean, char, float, double, short, byte
//        int[] intArr = new int[5];
//        printArray(intArr);
//        double[] doubleArr = new double[5];
//        printArray(doubleArr);
//
//        int[] intArr2 = new int[]{1,2,3,4,5};
//        printArray(intArr2);
//
//        //참조형 배열
//        String strArr[] = new String[3];
//        printArray(strArr);
//
//        strArr[0]= "치킨";
//        strArr[1]= "족발";
//        strArr[2]= "자장면";
//        printArray(strArr);
//
//        String[] strArr2 = {"트와이스", "블랙핑크", "씨잼"};
//        printArray(strArr2);
//
//        Book A[]={new Book("수학의 바이블", "김재영",100),new Book("워드 마스터", "전유원",200)};
//        printArray(A);
//
//        int[] intArr3 = new int[3];
//        System.out.println(intArr3.length);
//        System.out.println(intArr3[intArr3.length-1]);
//
//        String[] strArr3 = new String[3];
//        System.out.println(strArr3[0]);
//        System.out.println(strArr[3].length());
//
//        Book[] bookArr3= new Book[3];
//        System.out.println(bookArr3[0]);
//        System.out.println(bookArr3[0].getTitle());
//
//        String[] strArr4 = new String[]
//
//    }
//
//    private static void printArray(Book[] a) {
//        for (Book value : a){
//            System.out.println(value.toString());
//        }
//    }
//
//    private static void printArray(String[] strArr) {
//        for(String value : strArr){
//            System.out.print(value + " | ");
//        }
//        System.out.println();
//    }
//
//    private static void printArray(double[] doubleArr) {
//        for (double num: doubleArr ) {
//            System.out.println(num);
//        }
//    }
//
//    private static void printArray(int[] intArr) {
//        //intArr 배열 요소값 출력
//        for (int num : intArr) {
//            System.out.print(num+" | ");
//        }
//        System.out.println();
//    }
//}
