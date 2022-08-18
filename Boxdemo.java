import java.lang.*;
import java.io.*;
	 class Cube
	{
		int length, breadth, height;
		Cube(int l,int b,int h)
		{
			length=l;
			breadth=b;
			height=h;
		}
		public void display()
		{
			int volume=length*breadth*height;
			System.out.println("Volume of Box is : "+volume);
		}
	}
class CubeEx
{
	public static void main(String args[])
	{
		Cube c=new Cube(10,20,30);
		c.display();
	}
}