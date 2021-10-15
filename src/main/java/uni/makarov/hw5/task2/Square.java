package uni.makarov.hw5.task2;

public class Square extends Figure{

    Square(double side){
        this.side = side;
    }

    double side;

    @Override
    double calcArea() {
        return side*side;
    }

    @Override
    double calcPerimeter() {
        return 4*side;
    }
}
