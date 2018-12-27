package lesson2;

import java.util.Random;
import java.util.Scanner;

public class circle {
	private int radius = 1;
	private int xcoord = 0;
	private int ycoord = 0;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int value) {
		if (value > 0) {
			radius = value;
		} else {
			radius = 1; // значение по умолчанию
		}
	}

	public int getXcoord() {
		return xcoord;
	}

	public void setXcoord(int value) {
		xcoord = value;
	}

	public int getYcoord() {
		return ycoord;
	}

	public void setYcoord(int value) {
		ycoord = value;
	}

	public void changeCentreRandome() { // Преремещение центра в пределах [-99,-99] - [99,99]
		Random random = new Random();
		setXcoord(random.nextInt(199) - 99);
		setYcoord(random.nextInt(199) - 99);
	}

	circle() { // конструктор запрашивает данные
		Scanner input = new Scanner(System.in);
		setRadius(input.nextInt());
		input.nextLine();
		setXcoord(input.nextInt());
		input.nextLine();
		setYcoord(input.nextInt());
		input.nextLine();
		input.close();
	}

	public double lengthCentre(circle first, circle second) { // расстояние - корень квадратный из сумм квадратов
																// катетов
		double delta = Math.sqrt(Math.pow(first.getXcoord() - second.getXcoord(), 2)
				+ Math.pow(first.getYcoord() - second.getYcoord(), 2));
		return delta;
	}

	public boolean regard(circle first, circle second) { // расстояние между центрами либо сумма радиусов, либо разность
															// без учета знака
		double delta = lengthCentre(first, second);
		boolean bresult = (delta == first.getRadius() + second.getRadius())
				|| (delta == first.getRadius() - second.getRadius())
						| (delta == -first.getRadius() + second.getRadius());
		return bresult;
	}
}
