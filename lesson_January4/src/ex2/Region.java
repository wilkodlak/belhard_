package ex2;

import java.util.ArrayList;
import java.util.List;

public class Region {
	private String name;
	private String mainAreaName;
	// private ArrayList areaList;
	private List<Area> Areas = new ArrayList<>();

	Region(String name, Area mainArea) {
		this.mainAreaName = mainArea.getName();
		// areaList=Areas;
		Areas.add(mainArea);
		this.name = name;
	};

	public String getName() {
		return this.name;
	};

	public void addArea(Area area) {
		Areas.add(area);
	}

	public void setName(String name) {
		this.name = name;
	};

	public int getSquare() {
		int areaSquare = 0;
		// Areas.forEach(area-> {areaSquare=areaSquare+area.getSquare();});
		for (Area curArea : Areas) {
			areaSquare = areaSquare + curArea.getSquare();
		}
		;
		return areaSquare;
	}

	public String getMainAreaName() {
		return this.mainAreaName;
	}

	public Area getMainArea() {
		return this.Areas.get(0);
	}

	public void addRegion(Area newArea) {
		Areas.add(newArea);
	}

	public Area getAreaByIndex(int index) {
		return this.Areas.get(index);
	}

	public int getAreaCount() {
		return Areas.size();
	}
	public int hashCode() {
		return (int) (31 * super.hashCode()+this.name.length())+this.getSquare()+this.getAreaCount() ;
	}
	public String toString() {
		return getClass().getName() + " name: " + this.name+ " square: "+this.getSquare()+" towns: "+this.getAreaCount();
	}
	
	public boolean equals(Region obj) {
		return (this.name == obj.name) & (this.getSquare() == obj.getSquare()) & (this.mainAreaName == obj.mainAreaName)
				& (this.getAreaCount() == obj.getAreaCount()) & (this.getSquare() == obj.getSquare());

	}

}
