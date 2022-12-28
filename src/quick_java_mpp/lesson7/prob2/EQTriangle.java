package quick_java_mpp.lesson7.prob2;

public class EQTriangle implements Polygon {
	private double length;

	public EQTriangle(double length) {
		this.length = length;
	}

	@Override
	public double[] getSides() {
		double[] sides = { length, length, length };
		return sides;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

}
