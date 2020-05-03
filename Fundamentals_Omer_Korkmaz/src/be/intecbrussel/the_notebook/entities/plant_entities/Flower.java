package be.intecbrussel.the_notebook.entities.plant_entities;

public class Flower extends Plant{

	private Scent smel;
	
	public Flower(String name) {
		super(name);
	}
	
	public Flower(String name, double height) {
		super(name, height);
	}
	
	public Flower(String name, double height , Scent smel) {
		super(name, height);
		this.smel = smel;
	}

	public Scent getSmel() {
		return smel;
	}

	public void setSmel(Scent smel) {
		this.smel = smel;
	}

	@Override
	public String toString() {
		return "Flower [name=" + name + ", height=" + height + ", smel=" + smel + "]";
	}
}
