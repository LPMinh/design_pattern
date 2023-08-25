package entity;

public abstract class EmployeeDecorator implements EmployeeComponent {
	protected EmployeeComponent employee;
	

	public EmployeeDecorator(EmployeeComponent employee) {
		super();
		this.employee = employee;
	}
	@Override
	public void doTask() {
		System.out.println("checkin");
		
	}
	@Override
	public void join() {
		System.out.println("join");
		
	}
	@Override
	public void terminate() {
		System.out.println("terminate");
		
	}

	
	
	
}
