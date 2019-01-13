package ex2;

import java.util.ArrayList;
import java.util.List;

public class Area {
	private String name;
	private int square;
	private String mainTown;
	// private ArrayList townsList;
	private List<Town> towns = new ArrayList<>();

	public int getTownsCount() {
		return towns.size();
	}

	public Town getTownByIndex(int index) {
		return towns.get(index);
	}

	public int hashCode() {
		return (int) (31 * super.hashCode() + this.name.length()) + this.square + this.getTownsCount();
	}

	public String toString() {
		return getClass().getName() + " name: " + this.name + " square: " + this.square + " towns: "
				+ this.getTownsCount();
	}

	Area(String name, Town mainTown, int square) {
		this.name = name;
		if (square > 0) {
			this.square = square;
		} else {
			this.square = 0;
		}
		;
		this.mainTown = mainTown.getName();
		towns.add(mainTown);
		// townsList=towns;
	}

	public void addTown(Town name) {
		towns.add(name);
	}

	public void deleteTown(Town name) {
		towns.remove(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSquare() {
		return square;
	}

	public void setSquare(int square) {
		if (square > 0) {
			this.square = square;
		}
	}

	public String getMainTown() {
		return this.mainTown;
	}

	public boolean equals(Area obj) {
		return (this.name == obj.name) & (this.square == obj.square) & (this.mainTown == obj.mainTown)
				& (this.getTownsCount() == obj.getTownsCount()) & (this.getSquare() == obj.getSquare());
	}

}
