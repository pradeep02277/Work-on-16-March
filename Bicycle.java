package pradeep;

public class Bicycle {

//	public static void main(String[] args) {
// TODO Auto-generated method stub

private int Speed;
public Bicycle()

{

}
public Bicycle(int Speed)
{
this.Speed = Speed;
}

public int getSpeed(){

return Speed;
 
}
public void setSpeed(int Speed)
{
this.Speed = Speed;

}
public void applyBreak(int decrement)
{

Speed = Speed-1;
}
}

