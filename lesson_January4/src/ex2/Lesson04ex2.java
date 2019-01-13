package ex2;
/*
 4. Создать объект класса Государство, используя классы Область, Район,
Город. Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson04ex2 {
	public static void main(String[] args) {
		Region curRegion;

		List<Town> countryTowns = Arrays.asList(new Town("Сapital"), new Town("Area1Town"), new Town("Area2Town"),
				new Town("Region1Town"), new Town("Region2Town"), new Town("CapitalAreaTown"));
		countryTowns.forEach(town -> {
			System.out.println(" " + town.getName());
		});
		List<Area> countryAreas = new ArrayList<>();
		// countryAreas.forEach(area->{System.out.println(" "+area.getName());});
		countryAreas.add(new Area("CapitalArea", countryTowns.get(0), 20));// String name, Town mainTown, int squar
		// System.out.println(countryAreas.get(0).getName());
		System.out.println("============Areas===============");
		countryAreas.forEach(area -> {
			System.out.println(" " + area.getName());
		});
		countryAreas.add(new Area("FirstArea", countryTowns.get(1), 19));
		countryAreas.add(new Area("SecondArea", countryTowns.get(2), 21));
		countryAreas.add(new Area("FirstRegion", countryTowns.get(3), 22));
		countryAreas.add(new Area("SecondRegion", countryTowns.get(4), 19));
		countryAreas.get(0).addTown(countryTowns.get(5));
		countryAreas.forEach(area -> {
			System.out.println(" " + area.getName());
		});
		System.out.println("============Regions===============");
		List<Region> countryRegions = new ArrayList<>();
		// System.out.println(countryAreas.get(0).getName() + ' ' +
		// countryAreas.get(0).getTownByIndex(1).getName());
		countryRegions.add(new Region("CapitalRegion", countryAreas.get(0)));// String name, Area mainArea
		countryRegions.add(new Region("FirstRegion", countryAreas.get(3)));
		countryRegions.add(new Region("SecondRegion", countryAreas.get(4)));

		countryRegions.forEach(region -> {
			System.out.println(" " + region.getName() + " " + region.getMainAreaName() + " " + region.getSquare());
		});
		System.out.println("============Regions 2===============");
		countryRegions.get(1).addArea(countryAreas.get(1));
		// countryRegions.get(1).Areas.add(countryAreas.get(1));
		/*
		 * curRegion = countryRegions.get(1); int curRegionAreaCount =
		 * curRegion.getAreaCount(); for (int i = 0; i < curRegionAreaCount; i++) {
		 * System.out.println("add: " + curRegion.getAreaByIndex(i)); }
		 */

		countryRegions.get(2).addArea(countryAreas.get(2));
		System.out.println("============Regions 3===============");
		countryRegions.forEach(region -> {
			System.out.println(" " + region.getName());
		});
		/*
		 * countryRegions.add(new Region("SecondRegion", countryAreas.get(4)));
		 */
		System.out.println("============Regions 4===============");
		countryRegions.forEach(region -> {
			System.out.println(" " + region.getName());
		});
		System.out.println("============State===============");
		State bestState = new State("Kingdom", countryRegions.get(0));
		System.out.println(" " + bestState.getName());
		bestState.addRegion(countryRegions.get(1));
		bestState.addRegion(countryRegions.get(2));
		//Данные внесены
		System.out.println("The capital is " + bestState.getRegionByIndex(0).getAreaByIndex(0).getMainTown());
		System.out.println("Main in regions is " + bestState.getRegionsCount());
		System.out.println("Counts of regions is :");
		for (int i = 0; i < bestState.getRegionsCount(); i++) {
			System.out.println(bestState.getRegionByIndex(i).getAreaByIndex(0).getMainTown());
		}
		System.out.println("State's square is " + bestState.getSquare());
	}

}
