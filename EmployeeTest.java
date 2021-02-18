public class EmployeeTest{
	public static void main(String[] args) {
	Employee firstStaff = new Employee("Henry", "Chijioke", 200);
	Employee secondStaff = new Employee("Yusuf", "Kemi", 100);

	
	firstStaff.salary(200);
	System.out.println("Henry's Chijioke salary is : " + firstStaff.getSalary() * 12);

	secondStaff.salary(100);
	System.out.println("Kemi Yusuf salary is : " + secondStaff.getSalary() * 12);

	firstStaff.salary(200 * 12);
	firstStaff.increaseSalary(10); 
	System.out.println("Henry salary has been reviewed to : "  + firstStaff.getSalary());

	secondStaff.salary(100 * 12);
	secondStaff.increaseSalary(10);
	System.out.println("Kemi Yusuf salary has been reviewed to :"  + secondStaff.getSalary());
}
}