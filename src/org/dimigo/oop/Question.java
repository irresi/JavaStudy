package org.dimigo.oop;

import java.util.Scanner;
import java.util.Random;

public class Question {
    public static String[ ] questions = {
            "가장 좋아하는 가수는? ",
            "가장 좋아하는 배우는? ",
            "가장 좋아하는 과목은? "
    };
    public static String[] answers = {
            "아이유",
            "원빈",
            "자료구조"
    };
    public static void menu(){
        System.out.print("------------------\n" +
                "1. 질문 선택\n" +
                "2. 정답 공개\n" +
                "9. 프로그램 종료\n" +
                "------------------\n" +
                "메뉴 선택 => ");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer;
        Random random = new Random();
        int num;
        while(true){
            menu();
            num=scanner.nextInt();
            if(num==1){
                num=random.nextInt(3);
                System.out.print(questions[num]);
                answer=scanner.next();
                if(answer.equals(answers[num])){
                    System.out.println("정답입니다!");
                }
                else{
                    System.out.println("틀렸습니다!");
                }
            }
            else if(num==2){
                System.out.println("<< 정답 출력 >>");
                StringBuilder sb=new StringBuilder();
                for(int i=0;i<3;i++){
                    sb.append(questions[i]).append(answers[i]).append("입니다\n");
                }
                System.out.print(sb);
            }
            else if(num==9){
                System.out.println("Bye~");
                break;
            }
            else{
                System.out.println("없는 메뉴입니다.");
            }
        }
    }
}
