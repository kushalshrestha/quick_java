package quick_java_mpp.lesson7.prob2;

public class Ellipse implements ClosedCurve {
	private double semiMajorAxisLength;
	private double ellipticIntegralValue;

	public Ellipse(double semiMajorAxisLength, double ellipticIntegralValue) {
		this.semiMajorAxisLength = semiMajorAxisLength;
		this.ellipticIntegralValue = ellipticIntegralValue;
	}

	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return 4 * semiMajorAxisLength * ellipticIntegralValue;
	}

	public double getSemiMajorAxisLength() {
		return semiMajorAxisLength;
	}

	public void setSemiMajorAxisLength(double semiMajorAxisLength) {
		this.semiMajorAxisLength = semiMajorAxisLength;
	}

	public double getEllipticIntegralValue() {
		return ellipticIntegralValue;
	}

	public void setEllipticIntegralValue(double ellipticIntegralValue) {
		this.ellipticIntegralValue = ellipticIntegralValue;
	}

}
