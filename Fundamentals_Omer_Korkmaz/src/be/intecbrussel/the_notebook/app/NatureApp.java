package be.intecbrussel.the_notebook.app;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import be.intecbrussel.the_notebook.entities.animal_entities.*;
import be.intecbrussel.the_notebook.entities.plant_entities.*;
import be.intecbrussel.the_notebook.service.ForestNotebook;

public class NatureApp {

	public static void main(String[] args) {
		
		/*If there were an animal-type enum, such as smel and leaf type, 
		 * instead of the individual subclasses of the Animal class, 
		 * we could filter the animal species with less processing and more easily.
		 */
				
		ForestNotebook DigiJumanji_01 = new ForestNotebook();
		
		Carnivore carnivore1 = new Carnivore("Lion", 90, 1, 1.5, 2);
		Carnivore carnivore2 = new Carnivore("Lion", 80, 1, 1, 1.5); //controlemechanisme werkt
		Carnivore carnivore3 = new Carnivore("Fox", 25, 0.5, 1, 0.3);
		Herbivore herbivore1 = new Herbivore("Deer", 60, 1, 1.5);
		Herbivore herbivore2 = new Herbivore("Rabbit", 20, 0.3, 0.5);
		Herbivore herbivore3 = new Herbivore("Panda", 100, 1.5, 1);
		Omnivore omnivore1 = new Omnivore("Bear",  120, 2, 1);
		Omnivore omnivore2 = new Omnivore("Pig", 80, 1, 1.5);
		Omnivore omnivore3 = new Omnivore("Chimpanzee", 25, 1.5, 0.5);
		Omnivore omnivore4 = new Omnivore("Chipmunk", 10, 0.40, 0.3);
		
		Plant bush1 = new Bush("Abelia", 1.0 , "Raspberries", LeafType.SPEAR);
		Plant bush2 = new Bush("Abelia", 1.5, "Blueberries" , LeafType.HEART); //controlemechanisme werkt
		Plant bush3 = new Bush("Berberis", 0.50 , "Blackberries", LeafType.HAND);
		Plant bush4 = new Bush("Calia", 2, "Apples:)" , LeafType.ROUND);
		Plant flower1 = new Flower("Daisies", 0.50, Scent.EARTY);
		Plant flower2 = new Flower("Lilies", 10, Scent.MUSKY);
		Plant flower3 = new Flower("Orchids", 0.7, Scent.ORANGE);
		Plant flower4 = new Flower("Roses", 0.30, Scent.SWEET);
		Plant tree1 = new Tree("Ash", 10, LeafType.NEEDLE);
		Plant tree2 = new Tree("Birch", 5, LeafType.SPEAR);
		Plant tree3 = new Tree("Aspen", 8, LeafType.HEART);
		Plant weed1 = new Weed("Bindweed", 0.10, 1);
		Plant weed2 = new Weed("Quackgrass", 0.20, 2);
		
		//Planten toevoegen ann plant diet set			
		herbivore1.addPlantToDiet(weed1);
		herbivore1.addPlantToDiet(weed1); //controlemechanisme werkt
		herbivore1.addPlantToDiet(bush2);
		herbivore2.addPlantToDiet(flower4);
		herbivore3.addPlantToDiet(weed2);
		
		omnivore1.addPlantToDiet(bush1);
		omnivore2.addPlantToDiet(bush2);
		omnivore2.addPlantToDiet(bush2);//controlemechanisme werkt
		omnivore3.addPlantToDiet(bush3);
		omnivore4.addPlantToDiet(bush4);
		
		//Dieren toevoege
		DigiJumanji_01.addAnimal(carnivore1);
		DigiJumanji_01.addAnimal(carnivore1); //controlemechanisme werkt
		DigiJumanji_01.addAnimal(carnivore2);
		DigiJumanji_01.addAnimal(carnivore3);
		DigiJumanji_01.addAnimal(herbivore1);
		DigiJumanji_01.addAnimal(herbivore2);
		DigiJumanji_01.addAnimal(herbivore3);
		DigiJumanji_01.addAnimal(omnivore1);
		DigiJumanji_01.addAnimal(omnivore2);
		DigiJumanji_01.addAnimal(omnivore3);
		DigiJumanji_01.addAnimal(omnivore4);
		
		//Planten toevoegen
		DigiJumanji_01.addPlant(bush1);
		DigiJumanji_01.addPlant(bush1); //controlemechanisme werkt
		DigiJumanji_01.addPlant(bush2);
		DigiJumanji_01.addPlant(bush3);
		DigiJumanji_01.addPlant(bush4);
		DigiJumanji_01.addPlant(flower1);
		DigiJumanji_01.addPlant(flower2);
		DigiJumanji_01.addPlant(flower3);
		DigiJumanji_01.addPlant(flower4);
		DigiJumanji_01.addPlant(tree1);
		DigiJumanji_01.addPlant(tree2);
		DigiJumanji_01.addPlant(tree3);
		DigiJumanji_01.addPlant(weed1);
		DigiJumanji_01.addPlant(weed2);
		
		//Dieren en planten printen
		DigiJumanji_01.printNotebook();
		
		//Print de lijsten van carnivores, omnivores en herbivores afzonderlijk af.		
		System.out.println("\n" + "----Carnivores----" + "\n");
		DigiJumanji_01.getCarnivores().forEach(System.out :: println);
		
		System.out.println("\n" + "----Herbivores----" + "\n");
		DigiJumanji_01.getHerbivores().forEach(System.out :: println);
		
		System.out.println("\n" + "----Omnivores----" + "\n");
		DigiJumanji_01.getOmnivores().forEach(System.out :: println);
		
		
		//Planten en dieren sorteren
		System.out.println("\n" + "----Dieren gesorteerd op naam----" + "\n");
		DigiJumanji_01.sortAnimalsByName();
  
		System.out.println("\n" + "----Planten gesorteerd op naam----" + "\n");
		DigiJumanji_01.sortPlantsByName();
		
		System.out.println("\n" + "----Dieren gesorteerd op hoogte----" + "\n");
		DigiJumanji_01.sortAnimalsByHeight();
		
		System.out.println("\n" + "----Planten gesorteerd op hoogte----" + "\n");
		DigiJumanji_01.sortPlantsByHeight();
		
		//Druk het aantal dieren en planten af
		System.out.println("\n" + "----Animals Aantal----");
		System.out.println(DigiJumanji_01.getAnimalCount());
		
		System.out.println("\n" + "----Planten Aantal----");
		System.out.println(DigiJumanji_01.getPlantCount());
	
	}
}
