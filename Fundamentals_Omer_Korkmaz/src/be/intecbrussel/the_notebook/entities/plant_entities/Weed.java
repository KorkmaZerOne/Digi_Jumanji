package be.intecbrussel.the_notebook.entities.plant_entities;

public class Weed extends Plant{

	private double area;	
	
	public Weed(String name) {
		super(name);
	}
	
	public Weed(String name, double height) {
		super(name, height);
	}
	
	public Weed(String name, double height , double area) {
		super(name, height);
		this.area = area;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Weed [name=" + name + ", height=" + height + ", area=" + area + "]";
	}
}
