public class Triengle extends GeometricFigure{

    @Override
    public void perimeter() {
        double p=(add1() + add2() + add3())/2;
        System.out.println("Uchburchak perimetri");
        System.out.println(p);
    }

    @Override
    public void area() {
        double p=(add1() + add2() + add3())/2;
        double S=Math.sqrt(p*(p-add1())*(p-add2()*(p-add3())));
        System.out.println("Uchburchak yuzi");
        System.out.println(S);
    }

    public static void main(String[] args) {
       Triengle triengle=new Triengle();
       triengle.area();
       triengle.perimeter();
    }
}
