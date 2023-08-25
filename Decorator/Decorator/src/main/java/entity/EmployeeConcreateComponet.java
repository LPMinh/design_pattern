package entity;

public class EmployeeConcreateComponet implements EmployeeComponent {
	
	public void doTask() {
		System.out.println("checkin");
		
	}

	public void join() {
		System.out.println("joining");
		
	}

	public void terminate() {
		System.out.println("Terminal");
		
	}

}
