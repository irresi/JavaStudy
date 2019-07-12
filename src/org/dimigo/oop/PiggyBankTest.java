package org.dimigo.oop;

public class PiggyBankTest{
    public static void main(String[] args) {
        FamilyMember Family[]={new FamilyMember("아빠"),new FamilyMember("엄마"),new FamilyMember("나"),new FamilyMember("남동생")};
        FamilyMember.printMemberCnt();
        int i,money[]={10000,5000,2000,1000};
        for(i=0;i<4;i++) PiggyBank.putMoney(Family[i],money[i]);
        PiggyBank.printBalance();
        PiggyBank.putMoney(Family[2],1000);
        PiggyBank.printBalance();
    }
}
