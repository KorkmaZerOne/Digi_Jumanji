package be.intecbrussel.the_notebook.entities.animal_entities;

import java.util.*;

public class AnimalHeightComparator implements Comparator<Animal>{
	
	@Override
	public int compare(Animal o1, Animal o2) {
		
		return Double.compare(o1.getHeight(), o2.getHeight());
	}
}
