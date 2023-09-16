package equation;

public class SecondDegreeEquation
{
	private float a;
	private float b;
	private float c;
	
	//----------------------------------------------------------
	public SecondDegreeEquation(float a, float b, float c) 
	{
		this.a = a;
		this.b = b;
		this.c = c;
		
		if(Math.abs(a) < 0.000_000_000_1)
			throw new InvalidSecondDegreeException("Invalid value (a= "+a+")");
	}
	
	//----------------------------------------------------------
	public float getA()
	{
		return a;
	}

	//----------------------------------------------------------
	public final float getB()
	{
		return b;
	}

	//----------------------------------------------------------
	public final float getC()
	{
		return c;
	}
	
	//----------------------------------------------------------
	private float delta()
	{
		return  (b*b - 4*a*c);
	}
	
	//----------------------------------------------------------
	public boolean haveRealSolution()
	{
		float delta = this.delta();		
		return delta >= 0;
	}
	
	//----------------------------------------------------------
	public int howManyRealSolutions()
	{
		float delta = this.delta();
		
		if(delta < 0)
			return 0;
		
		if(delta > 0)
			return 2;
		
		return 1;
	}
	
	//----------------------------------------------------------
	public float[] getRealSolutions()
	{
		//to do
		return new float[0];
	}
}
