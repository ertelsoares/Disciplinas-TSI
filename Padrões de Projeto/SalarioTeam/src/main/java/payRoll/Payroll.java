package payRoll;

import employee.IEmployee;

public class Payroll
{
	
	private IEmployee employee;
	
	public Payroll(IEmployee employee) {
		super();
		this.employee = employee;
	}

	public float calculateSalary( float hours)
	{
		return this.employee.calculateSalary(hours);
	}
}
