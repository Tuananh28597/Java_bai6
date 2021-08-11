package baitap2_Point2Dand3D;

public class Point2D {
    private float x=0;
    private float y=0;

    public Point2D(){}

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getX() {
        return x;
    }

    public void setXY(float x, float y){
        this.x=x;
        this.y=y;
    }

    public float[] getXY(){
        float[] array = new float[2];
        array[0]=x;
        array[1]=y;
        return array;
    }

    @Override
    public String toString() {
        return "(" +x+ "," +y+ ")";
    }
}
