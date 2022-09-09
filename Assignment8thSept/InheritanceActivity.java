package Assignment8thSept;

public class InheritanceActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Manager emp1 = new Manager(126534,"Peter","Chennai India",237844,65000);
emp1.calculateSalary();
emp1.calculateTransportAllowance();
Trainee emp2 = new Trainee(29846,"Jack","Mumbai India",442085,45000);
emp2.calculateSalary();
emp2.calculateTransportAllowance();
	}

}
