package ex3;

public class Round extends Circle {
	// круг
	private int color;

	/* Round(Circle circle, int color) {
		super(circle.getPointX(), circle.getPointY(), circle.getRadius());
		this.color = color;
	}
*/
	public Round(Circle circle, int color2) {
		// TODO Auto-generated constructor stub

		super(circle.getPointX(), circle.getPointY(), circle.getRadius());
		this.color = color2;
	}
	

	public int getColor() {
		return this.color;
	};

	public void setColor(int color) {
		this.color = color;
	};

	public int hashCode() {
		return (int) (31 * super.hashCode() + this.color);
	}

	public String toString() {
		return getClass().getName() + " X: " + this.getPointX() + " Y " + this.getPointY() + " radius "
				+ this.getRadius() + " Color " + this.color;
	}

	public boolean equals(Round obj) {
		return super.equals(obj) & (this.color == obj.color);
		// (this.pointX == obj.PointX)&(this.pointY ==
		// obj.PointY)&(this.radius==obj.radius);
	}

	public boolean incideRound(Point p) {
		return (this.getRadius()
				* this.getRadius() >= ((p.getPointX() - this.getPointX()) * (p.getPointX() - this.getPointX())
						+ (p.getPointY() - this.getPointY()) * (p.getPointY() - this.getPointY())));
	};

}
