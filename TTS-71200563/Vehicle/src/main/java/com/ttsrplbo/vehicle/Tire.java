package com.ttsrplbo.vehicle;

public class Tire {
    private String tireType;
    private int width;
    private int aspectRatio;
    private int wheelDiameter;
    public Tire(String tireType, int width, int aspectRatio, int wheelDiameter){
        this.tireType=tireType;
        this.width=width;
        this.aspectRatio=aspectRatio;
        this.wheelDiameter=wheelDiameter;
    }
    public void setTireType(String tireType){this.tireType=tireType;}
    public void setWidth(int width){this.width=width;}
    public void setAspectRatio(int aspectRatio){this.aspectRatio=aspectRatio;}
    public void setWheelDiameter(int wheelDiameter){this.wheelDiameter=wheelDiameter;}

    public String getTireType(){return tireType;}
    public int getWidth(){return width;}
    public int getAspectRatio(){return aspectRatio;}
    public int getWheelDiameter(){return wheelDiameter;}
}
