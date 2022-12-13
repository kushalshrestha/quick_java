package quick_java.lesson7.prob2;

public interface Polygon extends ClosedCurve {

	public double[] getSides();

	default public double computePerimeter() {
		double[] sides = getSides();
		double perimeter = 0.0;
		for (double side : sides) {
			perimeter += side;
		}
		return perimeter;
	}

}
