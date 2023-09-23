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
		IEmployee employee;
		float expected;
		float obtained;
		
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
