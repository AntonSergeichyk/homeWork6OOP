import figures.Point;
import figures.Rectangle;

public class Main {
    public static void main(String[] args) {

        Point point1 = new Point(3, 3);
        Point point2 = new Point(6, 7);
        System.out.println("расстояние между точками: "+point2.distance(point1));

        Rectangle rectangle = new Rectangle(new Point(6, 3), new Point(3, 7));
        System.out.println("площадь прямоугольника равна: " + rectangle.areaRectangle());
        System.out.println("диагональ прямоугольника равна: " + rectangle.diagonalLenght());
    }
}
