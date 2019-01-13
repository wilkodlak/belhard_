package ex3;

public class Circle extends Point {
	// окружность
	private int radius;

	Circle(int pointX, int pointY, int radius) {
		super(pointX, pointY);
		this.radius = radius;
	}

	public Point getCentre() {
		return super.getPoint();
	};

	public void setCentre(Point p) {
		super.setPointX(p.getPointX());
		super.setPointY(p.getPointY());
	};

	public int getRadius() {
		return this.radius;
	};

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int hashCode() {
		return (int) (31 * super.hashCode() + this.radius);
	}

	public String toString() {
		return getClass().getName() + " X: " + this.getPointX() + " Y " + this.getPointY() + " radius " + this.radius;
	}

	public boolean equals(Circle obj) {
		return (this.getPointX() == obj.getPointX()) & (this.getPointY() == obj.getPointY())
				& (this.radius == obj.radius);
	}

}
