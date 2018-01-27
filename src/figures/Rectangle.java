package figures;

public class Rectangle {
    private Point leftAppedPoint;
    private Point rightBottonPoint;

    public Rectangle(Point leftAppedPoint, Point rightBottonPoint) {
        this.leftAppedPoint = leftAppedPoint;
        this.rightBottonPoint = rightBottonPoint;
    }

    public double areaRectangle() {
        return Math.abs(rightBottonPoint.getX() - leftAppedPoint.getX()) * Math.abs(leftAppedPoint.getY() - rightBottonPoint.getY());
    }

    public double diagonalLenght() {
        return leftAppedPoint.distance(rightBottonPoint);
    }
}
