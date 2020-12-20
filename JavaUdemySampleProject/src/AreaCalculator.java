public class AreaCalculator {
    public static void main(String[] args) {

        double area = 0;
        area = Area(5);
        System.out.println("Prining area:"+area);


    }

    public  static double Area(double radius){
        if (radius<=0)
            return -1;
        return radius*radius*Math.PI;
    }
    public static  double Area(double x, double y){
        if((x<0)||(y<0))
            return -1;
        return  x*y;
    }
}
