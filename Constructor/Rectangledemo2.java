// Program to illustrate the " Constructor Overloading " concept and Also Demonstrate on this keyword

import java.io.*;

class Rectangle1
{
	int length = 12, width;

	public Rectangle1(int length, int w2)	//  lentgh = 10 accepted from constructor
	{
		System.out.println("Length: "+length); // Print Current value of length accepted from Constructor
		System.out.println("Length: "+this.length); // Print the value of length throgh current object of class by this keyword
		
        int area = length * w2 ;
		
        System.out.println("Area of Rectangle == " +area);
		width = w2 ;
	}
}

class Rectangledemo2
{
	public static void main(String args[]) throws IOException
	{
		Rectangle1 r1 = new Rectangle1(10,5);
	}
}
