package baitap1_CircleAndCylinder;

public class Cylinder extends Circle{
    private double height=1.0;

    public Cylinder(){}

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(String color, double radius, double height) {
        super(color, radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getAreaCylinder(){
        return height*getArea();
    }

    @Override
    public String toString() {
        return " A Cylinder with a radius "
                + getRadius()
                 + " and height "
                + height;
    }
}
