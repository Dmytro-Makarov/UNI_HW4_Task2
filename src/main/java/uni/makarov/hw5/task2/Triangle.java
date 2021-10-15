package uni.makarov.hw5.task2;

public class Triangle extends Figure{

    Triangle(double A, double B, double C){
        sideA = A;
        sideB = B;
        sideC = C;
    }

    double sideA;
    double sideB;
    double sideC;

    @Override
    double calcArea() {
        double p = calcPerimeter()/2.0;
        double area = Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
        return area;
    }

    @Override
    double calcPerimeter() {
        return sideA + sideB + sideC;
    }
}
