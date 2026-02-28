import java.io.*;

abstract class Computercenter {
	abstract int ComputerNo() ;
} 

class Center1 extends Computercenter{
	int ComputerNo(){
		return 55 ;
	}
}

class Center2 extends Computercenter{
	int ComputerNo(){
		return 45 ;
	}
}

class AbstractClassDemo{
	public static void main(String[] args) {
		Center1 c1 = new Center1();
		System.out.println("No of Computer in center 1 =  " + c1.ComputerNo());

		Center2 c2 = new Center2();
		System.out.println("No of Computer in center 2 =  " + c2.ComputerNo());
	}
} 
