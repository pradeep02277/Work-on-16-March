public abstract class Shape {

    public Shape (String id)
    {this.id = id;}

    //Note that it is called in this class in the toString method.
    public abstract double getArea();

    public String getId()
    {return id;}
    
    public String toString( )
    {return "Shape[id="+id+",area="+getArea()+"]";}

    private String id;
  }