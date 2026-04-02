import java.io.*;

class SphereVolume{
	public static void main(String args[]) throws IOException{
		
			System.out.println("Enter the radius of the sphere::");

			InputStreamReader reader = new InputStreamReader(System.in);
			BufferedReader in = new BufferedReader (reader);

			String text = in.readLine();					// String DataType
			double r = Double.parseDouble (text);		// Double DataType
			
            double volume = (4.0 / 3.0) * 3.14 * r * r * r ;

			System.out.println ("Radius of the sphere: " +r);
			System.out.println ("Volume of the sphere: " +volume);	 
	}		
}
