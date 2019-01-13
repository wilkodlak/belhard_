package ex1;

public class Wheel {
	private int id;
	private int radius;
	private int season;
	private int pressure;

	public boolean equals(Wheel n) {
		return (this.radius == n.radius) & (this.season == n.season) & (this.pressure == n.pressure);
	}

	public int getRadius() {
		return radius;
	}

	public int getId() {
		return id;
	}

	public int getSeason() {
		return season;
	}

	public int getPressure() {
		return pressure;
	}

	public int hashCode() {
		return (int) (31 * id + radius + season + pressure);
	}

	public String toString() {
		return getClass().getName() + " id: " + id + " radius: " + radius + " season: " + season + " pressure: "
				+ pressure;
	}

	Wheel(int id, int radius, int season, int pressure) {
		this.id = id;
		if (radius >= 0)
			this.radius = radius;
		if ((season >= 0) && (season < 3)) {
			this.season = season;
		} else {
			System.out.println(" Error in season");
		}
		if (pressure >= 0) {
			this.pressure = pressure;
		}
	}
}
