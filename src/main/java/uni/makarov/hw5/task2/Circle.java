package uni.makarov.hw5.task2;

public class Circle extends Figure{

    Circle(double radius){
        this.radius = radius;
    }

    double radius;

    @Override
    double calcArea() {
        return Math.PI * radius;
    }

    @Override
    double calcPerimeter() {
        return 2 * Math.PI * radius;
    }
}
