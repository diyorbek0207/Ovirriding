public class Rectangle extends GeometricFigure{
    @Override
    public void area() {
        double S=add1()*add2();
        System.out.println(S);
    }

    @Override
    public void perimeter() {
        double p=(add1()+add2())*2;
        System.out.println(p);
    }



}
