package org.dimigo.oop;

public class PiggyBank {
    private static int balance;
    static void putMoney(FamilyMember member, int amount){
        System.out.println(member.getMemberName()+ " : "+ String.format("%,d원 넣음",amount));
        balance+=amount;
    }
    static void printBalance(){
        System.out.println("돼지저금통 총 금액 : "+String.format("%,d원",balance));
    }
}
