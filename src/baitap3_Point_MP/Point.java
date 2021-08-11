package baitap3_Point_MP;

public class Point {

        private float x=0;
        private float y=0;

        public Point(){}

        public Point(float x, float y) {
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
