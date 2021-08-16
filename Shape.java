package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shape {
    private ArrayList<Point> points=new ArrayList<>();

    public void addPoint(Point point){
        this.points.add(point);
    }

    public void  getPoints(){
        for(Point point: points){
            System.out.println("("+point.getX()+";"+point.getY()+")");
        }
    }

    public double calculatePerimeter(Shape shape){
        double perimeter=0;
        int numPoints=shape.points.size();
        for(int i=0; i<numPoints-1; i++) {
            perimeter += shape.points.get(i).Distance(shape.points.get(i+1));
        }
        perimeter+=shape.points.get(0).Distance(shape.points.get(numPoints-1));
        return perimeter;
    }

    public double getAvg(Shape shape){
        return shape.calculatePerimeter(shape)/shape.points.size();
    }

    public double getLongest(Shape shape){
        List<Double>sides=new ArrayList<>();
        int n=shape.points.size();
        for(int i=0; i<n-1; i++){
            sides.add(shape.points.get(i).Distance(shape.points.get(i+1)));
        }
        sides.add(shape.points.get(0).Distance(shape.points.get(n-1)));
        return Collections.max(sides);
    }

}

