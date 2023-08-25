package Appication;

import entity.DevEmployee;
import entity.EmployeeComponent;
import entity.EmployeeConcreateComponet;
import entity.EmployeeDecorator;
import entity.TestEmployee;

public class application {
	public static void main(String[] args) {
		System.out.println("employee1:Dev-Basic do task:");
		EmployeeComponent employee1= new DevEmployee(new EmployeeConcreateComponet());
		employee1.doTask();
		employee1.join();
		
		System.out.println("----------------------------------------------------------");
		
		
		System.out.println("employee2:Tester-Dev-Basic do task:");
		EmployeeComponent employee2=new DevEmployee(new TestEmployee(new EmployeeConcreateComponet()));
		employee2.doTask();
		
		System.out.println("----------------------------------------------------------");

		System.out.println("employee3:Basic do task:");
		EmployeeComponent emplpyee3=new EmployeeConcreateComponet();
		emplpyee3.doTask();
	}
}
