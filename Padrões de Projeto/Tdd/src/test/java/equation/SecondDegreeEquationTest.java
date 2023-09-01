package equation;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SecondDegreeEquationTest {

	@Test
	void shouldInstantiateCorrectlly() 
	{
		//gave
		float a = 1;
		float b = 2;
		float c = 3;
		
		//do /act
		SecondDegreeEquation equation = new SecondDegreeEquation(a,b,c);
		
		//check
		float obtained;
		
		obtained = equation.getA();
		assertTrue( (Math.abs(a - obtained) < 0.0001) );
	}

}
