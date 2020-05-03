package be.intecbrussel.the_notebook.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import be.intecbrussel.the_notebook.entities.animal_entities.*;
import be.intecbrussel.the_notebook.entities.plant_entities.*;

public class ForestNotebook {

	private List<Carnivore> carnivores;
	private List<Omnivore> omnivores;
	private List<Herbivore> herbivores;
	private int plantCount;
	private int animalCount;
	private List<Animal> animals;
	private List<Plant> plants;

	public ForestNotebook() {
		this.animals = new ArrayList<Animal>();
		this.plants = new ArrayList<Plant>();
		this.carnivores = new ArrayList<Carnivore>();
		this.omnivores = new ArrayList<Omnivore>();
		this.herbivores = new ArrayList<Herbivore>();
	}

	public void addAnimal(Animal animal) {
		List<Animal> existsAnimals = animals.stream().filter(item -> item.getName().equals(animal.getName()))
				.collect(Collectors.toList());
		if (existsAnimals.size() < 1) {
			if (animal instanceof Omnivore)
				omnivores.add((Omnivore) animal);
			if (animal instanceof Carnivore)
				carnivores.add((Carnivore) animal);
			if (animal instanceof Herbivore)
				herbivores.add((Herbivore) animal);

			animals.add(animal);
		}
	}

	public void addPlant(Plant plant) {
		List<Plant> existsPlants = plants.stream().filter(item -> item.getName().equals(plant.getName()))
				.collect(Collectors.toList());

		if (existsPlants.size() < 1)
			plants.add(plant);
	}

	public void printNotebook() {
		System.out.println("----Dieren----" + "\n");
		animals.forEach(System.out::println);
		System.out.println("\n" + "----Planten----" + "\n");
		plants.forEach(System.out::println);
	}

	public void sortAnimalsByName() {
		List<Animal> animalList = animals.stream().sorted(new AnimalNameComparator()).collect(Collectors.toList());
		animalList.forEach(System.out::println);
	}

	public void sortPlantsByName() {
		List<Plant> plantList = plants.stream().sorted(new PlantNameComparator()).collect(Collectors.toList());
		plantList.forEach(System.out::println);
	}

	public void sortAnimalsByHeight() {
		List<Animal> animalList = animals.stream().sorted(new AnimalHeightComparator()).collect(Collectors.toList());
		animalList.forEach(System.out::println);
	}

	public void sortPlantsByHeight() {
		List<Plant> plantList = plants.stream().sorted(new PlantHeightComparator()).collect(Collectors.toList());
		plantList.forEach(System.out::println);
	}

	public List<Carnivore> getCarnivores() {
		return carnivores;
	}

	public void setCarnivores(List<Carnivore> carnivores) {
		this.carnivores = carnivores;
	}

	public List<Omnivore> getOmnivores() {
		return omnivores;
	}

	public void setOmnivores(List<Omnivore> omnivores) {
		this.omnivores = omnivores;
	}

	public List<Herbivore> getHerbivores() {
		return herbivores;
	}

	public void setHerbivores(List<Herbivore> herbivores) {
		this.herbivores = herbivores;
	}

	public int getPlantCount() {
		plantCount = plants.size();
		return plantCount;
	}

	public int getAnimalCount() {
		animalCount = animals.size();
		return animalCount;
	}
}
