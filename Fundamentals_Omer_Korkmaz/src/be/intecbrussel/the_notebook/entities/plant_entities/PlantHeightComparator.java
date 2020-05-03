package be.intecbrussel.the_notebook.entities.plant_entities;

import java.util.Comparator;

public class PlantHeightComparator implements Comparator<Plant>{
	
	@Override
	public int compare(Plant o1, Plant o2) {
		return Double.compare(o1.getHeight(), o2.getHeight());
	}
}
