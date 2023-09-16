package equation;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SecondDegreeEquationTest
{

	@Test
	void shouldInstantiateCorrectlly()
	{
		//given
		float a = 1;
		float b = 2;
		float c = 3;
		
		//do / act
		SecondDegreeEquation equation = new SecondDegreeEquation(a,b,c);
		
		//check
		float obtained;
		
		obtained = equation.getA();
		assertTrue( (Math.abs(a - obtained) < 0.0001) );
		
		obtained = equation.getB();
		assertTrue( (Math.abs(b - obtained) < 0.0001) );
		
		obtained = equation.getC();
		assertTrue( (Math.abs(c - obtained) < 0.0001) );
	}

	@Test
	void shouldThrowsExceptionWithAnInvalidEquation()
	{
		float a = 0.0f;
		float b = 2.0f;
		float c = 3.0f;
		
		assertThrows ( InvalidSecondDegreeException.class, ()->
		{
			new SecondDegreeEquation(a,b,c);
		});
	}
}
