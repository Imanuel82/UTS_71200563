package com.ttsrplbo.vehicle;

public class Bus extends MotorVehicle{
    private int numPassanger;
    public Bus(Engine engine, Transmision transmision, Tire tire, Wheel wheel, int capacity){
        super(engine, tire, wheel, transmision);
    }
    @Override
    public void backWard(){}
    @Override
    public void forward(){}
    @Override
    public void brake(){}
    @Override
    public void turnLeft(){}
    @Override
    public void turnRight(){}
}
