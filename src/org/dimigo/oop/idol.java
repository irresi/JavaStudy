package org.dimigo.oop;

public class idol {
    static String[] GroupName = {"방탄", "2NE1", "걸스데이"};
    static String[ ][ ] memberName = {
            {"정국", "지민", "뷔", "슈가", "진"},
            {"CL", "산다라박", "박봄", "민지"},
            {"유라", "혜리", "소진", "민아"}
    };
    public static void main(String[] args) {
        int i,j;
        for(i=0;i<3;i++){
            System.out.println("<< "+GroupName[i]+ " >>");
            for (String s: memberName[i]) {
                System.out.println(s);
            }
            System.out.println();
        }
    }
}
