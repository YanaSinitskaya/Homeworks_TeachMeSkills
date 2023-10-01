package Task1;

public class Rectangle extends Figure{
int length = 10;
int width = 14;
    @Override
    double perimeter() {
        double perimetr = (double) 2*(10+14);
        return perimetr;
    }
    @Override
    double square() {
        double square = (double) length*width;
        return square;
    }
}

