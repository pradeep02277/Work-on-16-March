package StaticKeyword;
/*The static keyword in java is used for memory management mainly.
 *  We can apply java static keyword with variables, methods, blocks and nested class. 
 *  The static keyword belongs to the class than instance of the class.*/

public class MyClass {
public static void main(String[] args){
	Student Pradeep=new Student();
	Student Ajay=new Student();
	System.out.println(Student.getNoOfStudents());
	
  }
}
