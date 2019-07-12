package org.dimigo.oop;

public class Car{
    private String company;
    private String model;
    private String color;
    private int maxSpeed;
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