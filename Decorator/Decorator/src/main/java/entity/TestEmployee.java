package entity;

public class TestEmployee extends EmployeeDecorator {
	public TestEmployee(EmployeeComponent employee) {
		super(employee);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void doTask() {
		employee.doTask();
		testProgram();
	}
	public void testProgram() {
		System.out.println("testing....");
	}
}
