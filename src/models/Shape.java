package models;
import java.util.ArrayList;

public class Shape {

    final private ArrayList<Point> points = new ArrayList<>();

    public void addPoint(Point p) {
        points.add(p);
    }

    public float calculatePerimeter() {
        float perimeter = 0.0f;

        for (int i = 0; i < points.size(); i++) {

            Point currentPoint = points.get(i), nextPoint = points.get((i + 1) % points.size());

            float distance = (float)currentPoint.distance(nextPoint);
            perimeter += distance;
        }
        return perimeter;

    }

    public float getAverageSide() {
        float averageSide = 0.0f;

        for (int i = 0; i < points.size(); i++) {

            Point currentPoint = points.get(i), nextPoint = points.get((i + 1) % points.size());

            float distance = (float)currentPoint.distance(nextPoint);
            averageSide += distance;
        }

        return averageSide / points.size();
    }

    public float getLongestSide() {
        float longestSide = 0.0f;

        for (int i = 0; i < points.size(); i++) {

            Point currentPoint = points.get(i), nextPoint = points.get((i + 1) % points.size());

            float distance = (float) currentPoint.distance(nextPoint);
            if (longestSide < distance) {
                longestSide = distance;
            }
        }

        return longestSide;
    }
}
