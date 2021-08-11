package baitap3_Point_MP;

import baitap2_Point2Dand3D.Point2D;

public class main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);
        point2D =new Point2D(2,3);
        System.out.println(point2D);
        point2D.setXY(4,5);
        System.out.println(point2D.toString());



        movablePoint movablePoint1 = new movablePoint(2,4);
        System.out.println(movablePoint1);
        movablePoint1.move();
        System.out.println(movablePoint1.toString());



    }
}
