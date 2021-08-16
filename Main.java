package com.company;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        List<Point>points=new ArrayList<>();
        try{
            BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Desktop\\file1.txt"));
            String fileRead=br.readLine();
            while(fileRead!=null){
                String[]line=fileRead.split(",");
                int x=Integer.parseInt(line[0]);
                int y=Integer.parseInt(line[1]);
                Point point=new Point(x,y);
                points.add(point);
                fileRead= br.readLine();
            }
            br.close();
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
        Shape shape1=new Shape();
        for(Point each:points){
            shape1.addPoint(each);
        }
        System.out.println(shape1.calculatePerimeter(shape1));
        System.out.println(shape1.getAvg(shape1));
        System.out.println(shape1.getLongest(shape1));
        shape1.getPoints();
    }
}
