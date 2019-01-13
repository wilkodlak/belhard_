package ex1;

public class Engine {
	private int power;
	private int id;

	public boolean equals(Engine n) {
		return this.power == n.power;
	}

	public int getId() {
		return id;
	}

	public int getPower() {
		return power;
	}

	public int hashCode() {
		return (int) (31 * id + power);
	}

	public String toString() {
		return getClass().getName() + " id:" + id + " power:" + power;
	}

	Engine(int power, int id) {
		this.power = power;
		this.id = id;
	}
}
