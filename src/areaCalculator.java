public class areaCalculator {

    public static void main(String[] arg){

        System.out.println(area(-12));
    }


    public static double area(double radius){
        if(radius<0){
            return  -1;
        }
        double areaCircle = radius * radius * Math.PI;
        return areaCircle;
    }

    public static double area(double length,double breath){
        if(length<0 || breath<0){
            return  -1;
        }
        double areaRect = length * breath;
        return areaRect;
    }
}
