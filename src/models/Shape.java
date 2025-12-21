package models;
import java.util.ArrayList;

public class Shape {
    // container of Points (e.g. ArrayList<Point>)
    private ArrayList<Point> points = new ArrayList<>();

    // addPoint(Point) - adds to the container
    public void addPoint(Point p) {
        points.add(p);
    }

    // calculatePerimeter()
    public double calculatePerimeter() {
        double perimeter = 0.0;

        for (int i = 0; i < points.size(); i++) {

            Point currentPoint = points.get(i), nextPoint = points.get((i + 1) % points.size());

            double distance = currentPoint.distance(nextPoint);
            perimeter += distance;
        }
        return perimeter;

    }

    // getAverageSide()
    public double getAverageSide() {
        double averageSide = 0.0;

        for (int i = 0; i < points.size(); i++) {

            Point currentPoint = points.get(i), nextPoint = points.get((i + 1) % points.size());

            double distance = currentPoint.distance(nextPoint);
            averageSide += distance;
        }

        return averageSide / points.size();

    }

    // getLongestSide()
    public double getLongestSide() {
        double longestSide = 0.0;

        for (int i = 0; i < points.size(); i++) {

            Point currentPoint = points.get(i), nextPoint = points.get((i + 1) % points.size());

            double distance = currentPoint.distance(nextPoint);
            if (longestSide < distance) {
                longestSide = distance;
            }
            else {
                continue;
            }
        }

        return longestSide;
    }
}
