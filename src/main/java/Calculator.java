import java.util.*;
import java.util.stream.Collectors;

public class Calculator {

double addition (double ... addends) {
	return Arrays.stream (addends).sum ();
}

double subtraction (double ... numbers) {
	double difference = 0;
	
	List<Double> list = Arrays.stream (numbers).boxed ().collect (Collectors.toList ());
	
	double first = list.remove (0);
	
	ListIterator listIterator = list.listIterator ();
	
	while (listIterator.hasNext ()) {
	double next = (double) listIterator.next ();
		listIterator.remove ();
		difference = first - next;
	}
	
	return difference;
}

double division (double ... numbers) {
	List<Double> list = Arrays.stream (numbers).boxed ().collect (Collectors.toList ());
	return list.stream()
			.reduce(1.0, (a, b) -> a / b);
}

double multiplication (double ... factors) {
	List<Double> list = Arrays.stream (factors).boxed ().collect (Collectors.toList ());
	return list.stream()
			.reduce(1.0, (a, b) -> a * b);
}
	
}
