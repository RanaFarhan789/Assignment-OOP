interface Drawable
{
  void draw(); 
}
 class Rectangle implements Drawable
 {
    public void draw()
    {
	System.out.println("Drawing Rectangle");
	}
 }	
  class Circle implements Drawable
  {
  public void draw()
  {
  System.out.println("Drawing Circle");
  }
 } 
 
public class A62
{
	public static void main(String args[])
	{
		Rectangle r = new Rectangle();
		Circle c = new Circle();
		   r.draw();
		   c.draw();
		
	}
	
	
}