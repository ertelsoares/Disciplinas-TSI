package employee;

public class TeamLeader implements IEmployee
{
	float hourlyRate = 35;

	
	@Override
	public float calculateSalary(float hours) {
		// TODO Auto-generated method stub
		return this.hourlyRate * hours ;
	}

}
