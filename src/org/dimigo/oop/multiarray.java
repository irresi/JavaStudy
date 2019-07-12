package org.dimigo.oop;

public class multiarray {
    public static void main(String[] args) {
        int [][] intArr = new int[2][3];
        printArray(intArr);
        intArr[0][2]=intArr[1][1]=100;

        //String 타입 이차원배열
//        String [][] Sarr = {
//                {"C","C++","JAVA"},
//                {"C#", "PHP"}
////        };
//        String [][] Sarr = {
//                new String[] {"C","C++","JAVA"},
//                new String[] {"C#", "PHP"}
//        };
        String [][] Sarr = new String[][]{
                {"C","C++","JAVA"},
                {"C#", "PHP"}
        };
        printArray(Sarr);
    }

    private static void printArray(String[][] sarr) {
        for(String[] a : sarr){
            for(String b: a){
                System.out.print(b+ " ");
            }
            System.out.println();
        }
    }

    private static void printArray(int[][] intArr) {

        for(int[] a : intArr){
            for(int b: a){
                System.out.print(b+ " ");
            }
            System.out.println();
        }
    }

}
