/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * LinkedIn : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package design_patterns.factory_design_pattern;

public class PointDemo {
    public static void main(String[] args) {
        Point p = Point.Factory.newPolarPoint(2, 3); // reason why static is used in newPolarPoint() and newCartesianPoint() methods
    }
}

class Point {
    private final double x;
    private final double y;

    // constructor not public, explicitly use newCartesianPoint() and newPolarPoint() methods
    // Imp: make private constructor
    private Point(
            double x,
            double y
    ) {
        this.x = x;
        this.y = y;
    }


    public static class Factory {
        public static Point newCartesianPoint(
                double x,
                double y
        ) {
            return new Point(x, y);
        }

        public static Point newPolarPoint(
                double rho,
                double theta
        ) {
            return new Point(rho * Math.cos(theta), rho * Math.sin(theta));
        }

    }
}


