package Task1;

public class Circle extends Figure{
int radius = 22;

    @Override
    double perimeter() {
        double perimetr= (double) radius * PI;
        return perimetr;
    }
    @Override
    double square() {
       double square = (double) PI *radius*radius;
       return square;
    }
}
