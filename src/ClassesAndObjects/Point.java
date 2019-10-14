package ClassesAndObjects;

public class Point {

    private int x;
    private int y;

    public Point(){

    }

    public Point(int x , int y){
        this.y = y;
        this.x = x;

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance (){

        double x = getX();
        double y = getY();
        double dist = ((x-0)*(x-0) + (y-0)*(y-0));//d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
        return  Math.sqrt(dist);
    }

    public double distance(int x1 , int y1){
        double x = x1;
        double y = y1;
        double dist = ((getX()-x)*(getX()-x) + (getY()-y)*(getY()-y));//d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
        return  Math.sqrt(dist);

    }


    public double distance(Point second) {
        double x = second.getX();
        double y = second.getY();
        double dist = ((getX()-x)*(getX()-x) + (getY()-y)*(getY()-y));//d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
        return  Math.sqrt(dist);
    }
}
