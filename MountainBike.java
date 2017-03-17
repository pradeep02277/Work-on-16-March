package pradeep;

//public class MountainBike {
	public class MountainBike extends Bicycle {
		private int seatHeight;
	
		// default constructor
		public MountainBike(){
		System.out.println("Default constructor of MountainBike");
		}
		//constructor with 2 arguments which calls super class’s
		//constructor with 1 argument
		public MountainBike(int speed, int seatHeight){
		super(speed);
		this.seatHeight = seatHeight;
		}
		public int getSeatHeight()
		{
			return seatHeight;
		}
		}

