package org.dimigo.oop;

public class ParamArray {
    public static void main(String[] args) {
        int [] intArr = {1,2,3,4,5};
        add(intArr, 10);
        printArray(intArr);     //11, 12, 13, 14, 15

        String[] names= {"홍길동", "홍길서", "홍길남", "홍길북"};
        changeName(names, "김");
        printArray(names);
    }
    private static void changeName(String[] names, String chr){
        for(int i=0;i<names.length;i++){
            names[i]=chr+names[i].substring(1);
        }
    }
    private static void printArray(String[] names) {
        for(String s : names) System.out.print(s+" ");
        return;
    }

    private static void printArray(int[] intArr) {
        for (int num: intArr) {
            System.out.printf("%d ",num);
        }
    }
    private static void add(int [] intArr, int num){
        for(int i=0;i<intArr.length;i++){
            intArr[i]+=num;
        }
    }

}
