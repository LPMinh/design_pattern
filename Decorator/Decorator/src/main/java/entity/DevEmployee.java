package entity;

public class DevEmployee  extends EmployeeDecorator{
	public DevEmployee(EmployeeComponent employee) {
		super(employee);
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public void doTask() {
		employee.doTask();
		code();
		designpattern();
	}
	public void code() {
		System.out.println("coding ....");
	}
	public void designpattern() {
		System.out.println("design pattern...");
	}
	

}
