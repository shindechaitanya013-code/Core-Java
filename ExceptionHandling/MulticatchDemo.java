class MulticatchDemo{
	public static void main(String args[]){
		try{
			int a = args.length;

			System.out.println("No of Command line argument are i. e a = :" +a);
			int b= 40/a;

			int arr[] = new int[10];
			arr[12] = 30;
		}
		catch(ArithmeticException e){
				System.out.println("Catched Error Divide by Zero "+ e); 				
			}
		catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Array Index Out Of Bounds "+ e);
			}
		
        System.out.println("After Finishing Multiple catch clause ");
	}
}
