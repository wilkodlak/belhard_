package ex3;

public class Point {
	// точка
	private int pointX;
	private int pointY;

	public Point(int pointX2, int pointY2) {
		// TODO Auto-generated constructor stub
		this.pointX = pointX2;
		this.pointY = pointY2;
	}

	public int getPointX() {
		return this.pointX;
	};

	public int getPointY() {
		return this.pointY;
	};

	public void setPointX(int pointX) {
		this.pointX = pointX;
	}

	public void setPointY(int pointY) {
		this.pointY = pointY;
	}

	public int hashCode() {
		return (int) (31 * super.hashCode() + this.pointX + this.pointY);
	}

	public String toString() {
		return getClass().getName() + " X: " + this.pointX + " Y " + this.pointY;
	}

	public boolean equals(Point obj) {
		return (this.pointX == obj.pointX) & (this.pointY == obj.pointY);
	}

	public Point getPoint() {
		return this;
	};
}
