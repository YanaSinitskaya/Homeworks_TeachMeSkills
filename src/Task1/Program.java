package Task1;
public class Program {
public static void main(String[] args) {
Triangle triangle = new Triangle ();
Rectangle rectangle = new Rectangle();
Circle circle = new Circle();
Figure [] figure = {triangle, rectangle, circle};
double sumOfSquare = 0;
    for (Figure fig : figure) {
       sumOfSquare += fig.square();
    }
    System.out.println(sumOfSquare);

    }
}