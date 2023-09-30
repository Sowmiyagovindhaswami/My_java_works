package Sowmiya_vehicleapp;

public class Toyota extends Car{

	public Toyota(String name,  boolean isManual) {
		super(name, 4, 5,6, isManual, "Toyota");
		// TODO Auto-generated constructor stub
	}

	public void accelerate(int rate) {
	 int newspeed = getCurrentSpeed() + rate;
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
		changespeed(newspeed, getCurrentDirection());
	}
	}
}