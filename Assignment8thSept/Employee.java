package Assignment8thSept;

public class Employee {
 long employeeId,employeePhone;
 String employeeName,employeeAddress;
 double basicSalary;
 double specialAllowance=250.80;
 double Hra=1000.50;
public Employee(long id,String Name,String address,long phone){
	employeeId=id;
	employeeName=Name;
	employeeAddress=address;
	employeePhone=phone;
}
void calculateSalary() {
	double salary= basicSalary+ (basicSalary*specialAllowance/100) + (basicSalary*Hra/100);
	System.out.println("Salary of " +employeeName+ " is " +salary);}

void calculateTransportAllowance() {
	double transportAllowance = 10*basicSalary/100;
	System.out.println("Transport Allowance of " +employeeName+ " is " +transportAllowance);
}
}

class Manager extends Employee{

	public Manager(long id,String Name, String address, long phone, double salary){
		super(id, Name, address, phone);
		basicSalary=salary;
	
	}
	
	void calculateTransportAllowance() {
		double transportAllowance = 15*basicSalary/100;
		System.out.println("Transport Allowance of " +employeeName+ " is " +transportAllowance);
	}
}

class Trainee extends Employee{

	public Trainee(long id,String Name, String address, long phone, double salary){
		super(id, Name, address, phone);
		basicSalary=salary;
	
	}
	
	void calculateTransportAllowance() {
		double transportAllowance = 10*basicSalary/100;
		System.out.println("Transport Allowance of " +employeeName+ " is " +transportAllowance);
	}
}




