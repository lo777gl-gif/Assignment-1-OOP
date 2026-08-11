import models.Point;
import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/source");

        Scanner sc = new Scanner(file);
        Shape shape = new Shape();

        // Adding every point and calculating values
        while (sc.hasNext()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            Point point = new Point(x, y);
            shape.addPoint(point);
        }

        System.out.println("Characteristics of Triangle:");
        System.out.println("Perimeter = " + shape.calculatePerimeter());
        System.out.println("AverageSide = " + shape.getAverageSide());
        System.out.println("LongestSide = " + shape.getLongestSide());
    }
}
