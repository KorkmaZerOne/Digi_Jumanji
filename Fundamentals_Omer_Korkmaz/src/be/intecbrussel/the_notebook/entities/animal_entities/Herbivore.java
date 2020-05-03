package be.intecbrussel.the_notebook.entities.animal_entities;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import be.intecbrussel.the_notebook.entities.plant_entities.Plant;

public class Herbivore extends Animal{

	private Set<Plant> plantDiet;
	
	public Herbivore(String name) {
		super(name);
		plantDiet =new HashSet<>();
	}
	
	public Herbivore(String name, double weight, double height, double length) {
		super(name, weight, height, length);
		plantDiet =new HashSet<>();
	}
	

	public void addPlantToDiet( Plant plant ) {
		Set<Plant> existsPlantDiets = plantDiet.stream().filter(item -> item.getName().equals(plant.getName()))
				.collect(Collectors.toSet());
		
		if (existsPlantDiets.size() < 1) {
			plantDiet.add(plant);
		}
	}
	
	public void printDiet() {
		plantDiet.forEach(System.out:: println);
	}
	
	public Set<Plant> getPlantDiet() {
		return plantDiet;
	}

	public void setPlantDiet(Set<Plant> plantDiet) {
		this.plantDiet = plantDiet;
	}

	@Override
	public String toString() {
		return "Herbivore [name=" + name + ", height=" + height
				+ ", weight=" + weight +  ", length=" + length + " [plantDiet=" + plantDiet + "]";
	}	
}
