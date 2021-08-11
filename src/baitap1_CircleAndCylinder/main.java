package baitap1_CircleAndCylinder;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class main {
    public static void main(String[] args) {

        Circle circle = new Circle("red", 5);
        System.out.println(circle);
        System.out.println("Circle of Area is " + circle.getArea());

        Cylinder cylinder =new Cylinder("white",5.0,3.0);
        System.out.println(cylinder);
        System.out.println("Cylinder of Area is " + cylinder.getAreaCylinder());


    }
}
