package Task1;

public class Triangle extends Figure{
    int side1 = 5;
    int base = 10;
    int side2 = 8;
    int height = 5;
    @Override
    double perimeter() {
        double perimetr = (double) side1+base+side2;
        return perimetr;
        }
    @Override
    double square() {
        double square = (double) (base+height)/2;
    return square;
    }
}
