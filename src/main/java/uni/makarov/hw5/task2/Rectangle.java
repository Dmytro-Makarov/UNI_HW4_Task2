package uni.makarov.hw5.task2;

public class Rectangle extends Figure{

    Rectangle(double A, double B){
        sideA = A;
        sideB = B;
    }

    double sideA;
    double sideB;

    @Override
    double calcArea() {
        return sideA*sideB;
    }

    @Override
    double calcPerimeter() {
        return 2*(sideA + sideB);
    }
}
