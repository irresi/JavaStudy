package org.dimigo.oop;

public class Car3 {
    private String company;
    private String model;
    private String color;
    private int maxSpeed;

    public Car3(String company, String model, String color, int maxSpeed, int price) {
        this.company = company;
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }
    public Car3(String company, String model, String color, int maxSpeed) {
        this(company, model, color, maxSpeed, 0);
    }
    public Car3(String company, String model, String color) {
        this(company, model, color, 0,0);
    }

    private int price;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void pr(){
        System.out.println("제조사명 : "+getCompany());
        System.out.println("모델명 : "+getModel());
        System.out.println("색상 : "+getColor());
        System.out.println("최대속도 : "+getMaxSpeed()+"km");
        System.out.printf("가격 : %,d원\n\n",getPrice());
    }
}