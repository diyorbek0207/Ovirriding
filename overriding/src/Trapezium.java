public class Trapezium extends GeometricFigure{
    private int h=4;
    @Override
    public void perimeter() {
       double p=add1()+add2()+add3()*2;
        System.out.println(p);
    }

    @Override
    public void area() {
        double S=((add1()+add2())*h)/2;
        System.out.println(S);
    }
}
