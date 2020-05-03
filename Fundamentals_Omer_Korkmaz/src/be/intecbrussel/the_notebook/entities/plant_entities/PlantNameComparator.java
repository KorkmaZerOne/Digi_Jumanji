package be.intecbrussel.the_notebook.entities.plant_entities;

import java.util.Comparator;

public class PlantNameComparator implements Comparator<Plant> {

	@Override
	public int compare(Plant o1, Plant o2) {
		return o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
	}
}
