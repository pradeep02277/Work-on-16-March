package pradeep;
public class BikeTest {
	public static void main(String args[]){
		
	
		//Create object name bike1 of Bicycle class with speed = 10
		
		Bicycle bike1 = new Bicycle();
		bike1.setSpeed(10);
		
		
		//Create object name bike2 of MountainBike class with
		//speed = 20 and seatHeight = 5
		
		Bicycle bike2 = new Bicycle();
		bike2.setSpeed(20);
		MountainBike mbike2 = new MountainBike(5,10);
		//mbike2. 'seatHeight' = 5;
		
		//mbike2.setSpeed(5);
		//Create array of 2 Bike objects and assign above
		//bike1 and bike2 to its 0th and 1st element
System.out.println(mbike2.getSpeed());
System.out.println(mbike2.getSeatHeight());
}
	

}
