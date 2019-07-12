package org.dimigo.basic;

import java.util.*;

public class Messenger {
    private String name;
    private int number;
    private String password;
    private String id;
    private boolean login;
    public void start() {
        System.out.println("시작되었습니다");
        return;
    }
    public boolean check(boolean login) {
        if(login) System.out.println("로그인 되었습니다");
        else System.out.println("로그인이 안 되었습니다");
        return login;
    }
    public void printname(String name) {
        System.out.println("이름은 "+name+"입니다");
        return;
    }
    public void printnum(int number) {
        System.out.println("넘버는 "+number+"입니다");
        return;
    }
    public void printid(String id) {
        System.out.println("아이디는 "+id+"입니다");
        return;
    }

}