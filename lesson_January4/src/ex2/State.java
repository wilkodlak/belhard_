package ex2;

import java.util.ArrayList;
import java.util.List;

public class State {
	private String name;
	private String mainRegionName;
	private List<Region> Regions = new ArrayList<>();

	State(String name, Region mainRegion) {
		this.mainRegionName = mainRegion.getName();
		// areaList=Areas;
		Regions.add(mainRegion);
		this.name = name;
	};

	public int getRegionsCount() {
		return Regions.size();
	}

	public Region getRegionByIndex(int index) {
		return Regions.get(index);
	}

	public void addRegion(Region region) {
		Regions.add(region);
	}

	public String getName() {
		return this.name;
	};

	public void setName(String name) {
		this.name = name;
	};

	public int getSquare() {
		int regionsSquare = 0;
		// Areas.forEach(area-> {areaSquare=areaSquare+area.getSquare();});
		for (Region curRegion : Regions) {
			regionsSquare = regionsSquare + curRegion.getSquare();
		}
		;
		return regionsSquare;
	}

	public String getMainRegionName() {
		return this.mainRegionName;
	}
	public int hashCode() {
		return (int) (31 * super.hashCode()+this.name.length())+this.getSquare()+this.getRegionsCount() ;
	}
	public String toString() {
		return getClass().getName() + " name: " + this.name+ " square: "+this.getSquare()+" towns: "+this.getRegionsCount();
	}
	public boolean equals(State obj) {
		return (this.name == obj.name) & (this.getSquare() == obj.getSquare()) & (this.mainRegionName == obj.mainRegionName)
				& (this.getRegionsCount() == obj.getRegionsCount()) & (this.getSquare() == obj.getSquare());
	}

}
