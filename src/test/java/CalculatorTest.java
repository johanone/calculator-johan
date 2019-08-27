import org.apache.commons.lang3.RandomUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

double d = 0;
double dd  = 0;
double ddd = 0;
private List<Double> listOfDoubles;

@BeforeEach
void setUp () {
listOfDoubles = new ArrayList<> (Arrays.asList(1.0,2.0,2.5,3.0,4.5,6.0));
}

double testDouble () {
	return listOfDoubles.remove (RandomUtils.nextInt (0, listOfDoubles.size ()));
}

@AfterEach
void tearDown () {
}

@Test
void addition () {
	double[] addends = {d = testDouble(),dd = testDouble(),ddd = testDouble()};
	double res = Arrays.stream (addends).sum ();
	assertEquals (res, (d+dd+ddd));
}

@Test
void subtraction () {
}

@Test
void division () {
}

@Test
void multiplication () {
}
}