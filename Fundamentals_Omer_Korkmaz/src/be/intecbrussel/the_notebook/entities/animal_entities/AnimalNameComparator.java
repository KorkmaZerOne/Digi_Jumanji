package be.intecbrussel.the_notebook.entities.animal_entities;

import java.util.Comparator;

public class AnimalNameComparator implements Comparator<Animal>{

	@Override
	public int compare(Animal o1, Animal o2) {
		return o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
	}
}
