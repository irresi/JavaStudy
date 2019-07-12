package org.dimigo.abstractclass;

public class BenzEngine extends Engine{

    public BenzEngine() {
    }

    @Override
    public void startEngine() {
        System.out.println("Benz 엔진 가동");
    }

    @Override
    public void stopEngine() {
        System.out.println("Benz 엔진 멈춤");
    }

}
