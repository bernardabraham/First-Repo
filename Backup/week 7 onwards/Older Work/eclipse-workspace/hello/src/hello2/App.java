package hello2;

public class App {
	
		
		public static void main(String[] args) { //created a main method
			MathClass mc = new MathClass(); //creates a new object
			int a=mc.addNumber(4, 3); //passes two numbers into the method
			System.out.println(a);
			int b=mc.multiplyNumber(4, 3); //passes two numbers into the method
			System.out.println(b);
			Double c=mc.divideNumber(4, 6); //passes two numbers into the method
			System.out.println(c);
		
		}
		
		
		
	}
	

