package Java_Oops;
/*We can create multiple objects by one type only as we do in case of primitives.
 Object and Class Example: Initialization through constructor
 */
class Rectangle{  
	 int length;  
	 int width;  
	 void insert(int l, int w){  
	  length=l;  
	  width=w;  
	 }  
	 void calculateArea()
	 {
		 System.out.println(length*width);// Area of Rectangle=length*width
		 }  
	}  
	class TestRectangle{  
	 public static void main(String args[]){  
	  Rectangle r1=new Rectangle();  //creating two objects
	  Rectangle r2=new Rectangle();  
	  r1.insert(15,7);  
	  r2.insert(6,13);  
	  r1.calculateArea();  
	  r2.calculateArea();  
	}  
	}  