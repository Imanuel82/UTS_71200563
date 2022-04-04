package com.ttsrplbo.vehicle;

public class Truck extends MotorVehicle{
    private int capacity;
    public Truck(Engine engine, Transmision transmision, Tire tire, Wheel wheel, int capacity){
        super(engine, tire, wheel, transmision);
        this.capacity=capacity;
    }

    public void setCapacity(int capacity){this.capacity=capacity;}
    public int getCapacity(){return capacity;}

    @Override
    public void backWard() {}
    @Override
    public void forward(){}
    @Override
    public void brake(){}
    @Override
    public void turnLeft(){}
    @Override
    public void turnRight(){}
}
