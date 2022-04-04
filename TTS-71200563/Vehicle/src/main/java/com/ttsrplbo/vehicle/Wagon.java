package com.ttsrplbo.vehicle;

public class Wagon implements Vehicle {
    private String pullers;
    private Wheel wheel;
    public Wagon(String pullers, Wheel wheel){
        this.pullers=pullers;
        this.wheel=wheel;
    }
    public void setPullers(String pullers){this.pullers=pullers;}
    public void setWheel(Wheel wheel){this.wheel=wheel;}
    public String getPullers(){return pullers;}
    public Wheel getWheel(){return wheel;}


    @Override
    public void backWard(){}
    @Override
    public void brake(){}
    @Override
    public void forward(){}
    @Override
    public void turnRight(){}
    @Override
    public void turnLeft(){}
}
