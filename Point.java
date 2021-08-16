package com.company;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int getX(){
        return x;
    }

    public  int getY(){
        return y;
    }

    public void setX(int x){
        this.x=x;
    }

    public void setY(int y){
        this.y=y;
    }


    public double Distance( Point p2){
        double d1= Math.pow((p2.getX()-getX()), 2);
        double d2=Math.pow((p2.getY()-getY()), 2);
        double distance=Math.sqrt(d1+d2);
        return distance;
    }
}
