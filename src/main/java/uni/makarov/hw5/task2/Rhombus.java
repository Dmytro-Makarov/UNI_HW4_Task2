package uni.makarov.hw5.task2;

public class Rhombus extends Figure{

    Rhombus(double side, double angle){
        this.side = side;
        this.angle = angle;
    }

    double side;
    double angle; //degrees

    @Override
    double calcArea() {
        return side*side*Math.sin(Math.toRadians(angle));
    }

    @Override
    double calcPerimeter() {
        return 4*side;
    }
}
