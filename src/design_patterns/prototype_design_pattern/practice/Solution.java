package design_patterns.prototype_design_pattern.practice;

class Point {
    public int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

class Line {
    public Point start, end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Line deepCopy() {
        Point newStart = new Point(start.x, start.y);
        Point newEnd = new Point(end.x, end.y);
        return new Line(newStart, newEnd);
    }

    @Override
    public String toString() {
        return "Line{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        Line line1 = new Line(
                new Point(3, 3),
                new Point(10, 10)
        );

        Line line2 = line1.deepCopy();
        line2.start.x = line1.start.x;
        line2.end.x = line1.end.x;
        line2.start.y = 5;
        line2.end.y = 5;
        System.out.println("LINE 1 :::> " + line1);
        System.out.println("LINE 2 :::> " + line2);

    }
}