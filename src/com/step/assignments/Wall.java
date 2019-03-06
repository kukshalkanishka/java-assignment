package com.step.assignments;

public class Wall {
    private double height;
    private double width;


   public Wall(double width, double height){
        this.width = width;
        this.height = height;
        if(width < 0){
            this.width = 0;
        }
        if(height <0){
            this.height = 0;
        }
    }

    public Wall(){

    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
        if(height < 0){
            this.height = 0;
        }
    }

    public void setWidth(double width) {
        this.width = width;
        if(width<0){
            this.width = 0;
        }
    }

    public double getArea(){
        return this.width * this.height;
    }
}
