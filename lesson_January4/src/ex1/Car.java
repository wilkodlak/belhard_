package ex1;

public class Car {
	private int id;
	private Engine carEngine;
	private Wheel leftTopWheel;
	private Wheel rightTopWheel;
	private Wheel leftBottomWheel;
	private Wheel rightBottomWheel;
	private int model;
	private int color;
	private int petrol;

	public boolean equals(Car other) {
		return (this.model == other.model) & (this.carEngine == other.carEngine) & (this.color == other.color);
	};

	public boolean go(boolean move, int km) {
		if (move) {
			System.out.println(" The car is going");
			if (this.petrol - km * 0.1 >= 0) {
				this.petrol = this.petrol - (int) (km * 0.1);
			} else {
				this.petrol = 0;
				System.out.println("The car is staying");
				return false;
			}
		} else {
			System.out.println("The car is staying");
		}
		return move;
	}

	public int refuel(int petrol) {
		this.petrol = this.petrol + petrol;
		return this.petrol;
	}

	Car(int id, int model, int color, Engine carEngine, Wheel leftTopWheel, Wheel rightTopWheel, Wheel leftBottomWheel,
			Wheel rightBottomWheel) {
		this.id = id;
		this.carEngine = carEngine;
		this.leftTopWheel = leftTopWheel;
		this.rightTopWheel = rightTopWheel;
		this.leftBottomWheel = leftBottomWheel;
		this.rightBottomWheel = rightBottomWheel;
		this.model = model;
		this.color = color;
		this.petrol = 0;
	}

	public int hashCode() {
		return (int) (31 * id + color + model + carEngine.getPower());
	}

	public String toString() {
		return getClass().getName() + " id:" + id + " power:" + carEngine.getPower() + " model: " + model + " color: "
				+ color;
	}

	public void showModel() {
		System.out.println(" model: " + model);
	}

	public boolean changeWheel(Wheel n, boolean bottom, boolean left) {
		setWheel(n, bottom, left);
		return true;
	}

	public void setWheel(Wheel n, boolean bottom, boolean left) {
		if (bottom & left) {
			this.leftBottomWheel = n;
		} else {
			if (!bottom & left) {
				this.leftTopWheel = n;
			} else {
				if (!left & bottom) {
					this.rightBottomWheel = n;
				} else {
					this.leftTopWheel = n;
				}
			}
		}
	}
}
