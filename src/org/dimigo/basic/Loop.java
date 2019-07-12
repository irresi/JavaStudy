package org.dimigo.basic;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        /*
        // for 문
        int i,j;
        for(i=2;i<=9;i++){
            for(j=1;j<=9;j++){
                System.out.printf("%d * %d=%2d ",i,j,i*j);
            }
            System.out.println();
        }
        //for - each 문
        int[] arr = {1,2,3,4,5};
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        for(int num : arr){
            System.out.print(num + " ");
        }
        */
        String[] idol = {"승리", "태양", "TOP", "GD", "대성"};
        for (String temp : idol) System.out.print(temp + " ");

        //do~while
        Scanner scanner = new Scanner(System.in);
        int menu=0;

        do {
            System.out.println("<< 아이돌 선택 >>");
            System.out.println("1. 트와이스");
            System.out.println("2. 블랙핑크");
            System.out.println("3. 아이즈원");
            System.out.println("9. 종료");
            System.out.print("메뉴 선택 => ");

            menu = scanner.nextInt();
            switch(menu){
                case 1:
                    System.out.println("트와이스 선택"); break;
                case 2:
                    System.out.println("블랙핑크 선택"); break;
                case 3:
                    System.out.println("아이즈원 선택"); break;
                case 9:
                    System.out.println("Bye"); scanner.close(); break;
                default:
                    System.out.println("없는 메뉴입니다");
            }
        }while(menu !=9);
    }
}
