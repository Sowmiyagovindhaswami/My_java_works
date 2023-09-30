package Sowmiya_vehicleapp;

public class Car extends Vehicle {
	
	private int wheels;
	private String type;
	private int doors;
	private int gears;
	private boolean isManual;
	private int currentgear;
	
	public Car(String name,int wheels, int doors, int gears, boolean isManual,String type) {
		super(name);
		
		this.type = type;
		this.gears = gears;
		this.doors = doors;
		this.isManual = isManual;
		this.wheels = wheels;
		currentgear = 1;
	}

	public void changegear(int newgear) {
		this.currentgear = newgear;
		System.out.println("changegear method called: changed to"+this.currentgear +"gear");
		}
    public void changespeed(int newspeed, int newDirection) {
    	move(newspeed,newDirection);
    	System.out.println("changespeed method called:speed ->"+newspeed+"direction ->" + newDirection );
    }
}
