package employee;

public class Recruiter implements IEmployee
{
	float hourlyRate = 20;
	float hireBonus = 500;
	
	private float calculateBonus(float hours)
	{
		if(hours > 100)
			return hireBonus;
		
		return 0;
	}

	@Override
	public float calculateSalary(float hours) {
		return hours * this.hourlyRate + calculateBonus(hours);
	}

}
