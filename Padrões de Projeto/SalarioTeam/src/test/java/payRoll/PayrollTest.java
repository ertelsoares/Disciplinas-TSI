package payRoll;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import employee.Developer;
import employee.IEmployee;
import employee.Recruiter;
import employee.TeamLeader;

class PayrollTest {

	@Test
	void shouldReturnCorrectDeveloperSalary() {
		float hourlySalary = 40;
		float numberOfHours = 2;

		IEmployee employee = new Developer();

		float obtained = employee.calculateSalary(numberOfHours);

		float expected = numberOfHours * hourlySalary;

		assertEquals(expected, obtained);
	}

	@Test
	void shouldReturnCorrectTeamLeaderSalary() {
		float hourlySalary = 35;
		float numberOfHours = 2;

		IEmployee employee = new TeamLeader();

		float obtained = employee.calculateSalary(numberOfHours);

		float expected = numberOfHours * hourlySalary;

		assertEquals(expected, obtained);
	}

	@Test
	void shouldReturnCorrectRecruiterSalary() {
		float hourlySalary = 20;
		float numberOfHours = 200;
		float hireBonus = 500;
		IEmployee employee = new Recruiter();

		float obtained = employee.calculateSalary(numberOfHours);

		float expected = numberOfHours * hourlySalary + hireBonus;

		assertEquals(expected, obtained);
	}

	@Test
	void shouldReturnCorrectPayrollSalary() {
		float expected;
		float obtained;
		IEmployee[] employees = {new Developer(),new TeamLeader(), new Recruiter(),new Recruiter()};
		float hours[] = {2,2,2,101};
		float expectedSalary[] = {80,70,40,2520};
		
		
		for (int i = 0; i < employees.length; i++) {
			Payroll payroll = new Payroll(employees[i]);
			expected =expectedSalary[i];
			obtained = payroll.calculateSalary(hours[i]);
			assertEquals(expected, obtained);
		}
		
		IEmployee employee;
		
		
		employee = new Developer();
		expected = 80;
		Payroll payroll = new Payroll(employee);

		obtained = payroll.calculateSalary(2);
		assertEquals(expected, obtained);

		employee = new TeamLeader();
		payroll = new Payroll(employee);
		expected = 70;
		obtained = payroll.calculateSalary(2);
		assertEquals(expected, obtained);

		employee = new Recruiter();
		payroll = new Payroll(employee);
		expected = 40;
		obtained = payroll.calculateSalary(2);
		assertEquals(expected, obtained);

		employee = new Recruiter();
		payroll = new Payroll(employee);
		expected = 2520;
		obtained = payroll.calculateSalary(101);
		assertEquals(expected, obtained);
	}
	// Fazer para as outras três

}
