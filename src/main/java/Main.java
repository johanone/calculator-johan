public class Main {


public static void main (String[] args) {
	
	Calculator calculator = new Calculator ();
	
	System.out.println (calculator.addition (2.0, 2.5));
	System.out.println (calculator.addition (1.0, 2.0, 3.0));
	System.out.println (calculator.addition (2.0, 4.5, 6.0));
	
	System.out.println (calculator.subtraction (2.0, 2.5));
	System.out.println (calculator.subtraction (1.0, 2.0, 3.0));
	System.out.println (calculator.subtraction (2.0, 4.5, 6.0));
	
	System.out.println (calculator.multiplication (2.0, 2.5));
	System.out.println (calculator.multiplication (1.0, 2.0, 3.0));
	System.out.println (calculator.multiplication (2.0, 4.5, 6.0));
	
	System.out.println (calculator.division (2.0, 2.5));
	System.out.println (calculator.division (1.0, 2.0, 3.0));
	System.out.println (calculator.division (2.0, 4.5, 6.0));
	
}
}
