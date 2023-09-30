package Sowmiya_vehicleapp;

public class vehicle {

	private String name;
	private int currentspeed;
	private int currentDirection;
	
	public vehicle(String name) {
	this.name = name;
	this.currentspeed = 0;
	this.currentDirection = 0;
	
	}
public void steer(int direction) {	
   this.currentDirection += direction;
   System.out.println("steer method called: Steering at"+ currentDirection+"degrees.");
   
}
public void move (int speed,int direction) {
	currentspeed = speed;
	currentDirection = direction;
	System.out.println("move method called:Moving at "+currentspeed + "in direction"+currentDirection);
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getCurrentspeed() {
	return currentspeed;
}
public void setCurrentspeed(int currentspeed) {
	this.currentspeed = currentspeed;
}
public int getCurrentDirection() {
	return currentDirection;
}
public void setCurrentDirection(int currentDirection) {
	this.currentDirection = currentDirection;
}
public void stop() {
	this.currentspeed = 0;
}
	}

package Sowmiya_vehicleapp;

public class Car extends vehicle {     // car class is inherit from vehicle class
	
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
package Sowmiya_vehicleapp;

public class Toyota extends Car{

	public Toyota(String name,  boolean isManual) {
		super(name, 4, 5,6, isManual, "Toyota");
		// TODO Auto-generated constructor stub
	}

	public void accelerate(int rate) {
	 int newspeed = getCurrentspeed() + rate;
	 /*
	  * speed 0 - 10 : gear 1
	  * speed 10 - 20 : gear 2
	  * speed 20 - 30 : gear 3
	  * speed 30 - 50 : gear 4
	  * speed 50 - 70 : gear 5
	  * 6
	  */
	 if(newspeed == 0) {
		 stop();
		 changegear (1);
	 }else if (newspeed > 0 && newspeed <= 10) {
		 changegear(1);
	 }else if (newspeed > 10 && newspeed <= 20) {
		 changegear(2);
	 }else if (newspeed > 20 && newspeed <= 30) {
		 changegear(3);
	 }else if (newspeed > 30 && newspeed <= 50) {
		 changegear(4);
	 }else if (newspeed > 50 && newspeed <= 70) {
		 changegear(5);
	 }else {
		 changegear(6);
	 }
	if(newspeed > 0) {
		changespeed(newspeed,getCurrentDirection());
	}
	}
}
package Sowmiya_vehicleapp;

public class Main {
	
	public static void main(String[] args) {
Toyota sowmiya = new Toyota("sowmiya",false);
sowmiya.move(40, 0);
sowmiya.accelerate(20);
sowmiya.accelerate(-60);	

}
}
