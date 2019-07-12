package org.dimigo.oop;

public class StringTest2 {
    public static void main(String[] args) {
        /*//1. String
        String str="디미고 ";
        str+="2학년 ";
        str+="6반 ";
        str+="김종수";

        //2. StringBuilder
        StringBuilder sb = new StringBuilder("디미고 ");
        sb.append("2학년 ").append("6반 ").append("김종수");

        System.out.println(sb.toString());
        System.out.println(sb);
        */
        //속도 비교 메소드
        compareSpeed();
    }

    private static void compareSpeed() {
        long start=System.currentTimeMillis();
        String str="ABC";
        StringBuffer sb= new StringBuffer("abc");
        StringBuilder sb2= new StringBuilder("abc");
        for(int i=0;i<100000000;i++){
            sb.append("def");
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }
}
