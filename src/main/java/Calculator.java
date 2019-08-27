import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Calculator {

double addition (double ... addends) {
	return Arrays.stream (addends).sum ();
}

double subtraction (double ... numbers) {
	List<Double> list = Arrays.stream (numbers).boxed ().collect (Collectors.toList ());
	return list.stream()
			.reduce(0.0, (a, b) -> a - b);
}

double division () {
	return 0;
	
}

double multiplication (double ... factors) {
	List<Double> list = Arrays.stream (factors).boxed ().collect (Collectors.toList ());
	return list.stream()
			.reduce(1.0, (a, b) -> a * b);
}
	
}
