
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UseEmployee {
	static Scanner s = new Scanner(System.in);
	static int selection = 0;
	public static EmployeeServiceImpl ES = new EmployeeServiceImpl();
	public static List<Employee> empList = new ArrayList<Employee>();
	public static void main(String[] args) {
		//
		

		Employee e1 = new Employee(101, "Ginni", 15);
		Employee e2 = new Employee(102, "George", 2);
		Employee e3 = new Employee(103, "Gack", 44);
		Employee e4 = new Employee(104, "Gared", 9);
		Employee e5 = new Employee(105, "Gessica", 52);

		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);

		printMenu();
		while (s.hasNext()) {
			if (s.hasNextInt()) {
				selection = s.nextInt();
			}

			switch (selection) {
			case 1:
				ES.displayAllEmployees(empList);
//empList.forEach(e -> System.out.println(e));
				printMenu();
				break;
			case 2:
				System.out.println("Enter employee number 101-105: ");
				System.out.println(ES.calculateYearlySalary(empList,s.nextInt()));
				//ES.calculateYearlySalary(empList, s.nextInt());
				printMenu();
				break;
			case 3:
				System.out.println("Enter employee number 101-105: ");
				ES.findByEmployeeNumber(empList, s.nextInt());
				printMenu();
				break;
			case 4:
				System.out.println("Enter employee number 101-105: ");
				int en = s.nextInt();
				ES.findByEmployeeNumber(empList, en);
				
				printMenuDetails();
				s.nextInt();
				System.out.flush();
				System.out.println("Enter new employee name: ");
				ES.updateEmpName(en, s.next());
				break;
			case 5:
				System.out.println("Enter employee number 101-105: ");
				ES.deleteEmployee(s.nextInt());
				printMenu();
				break;
			case 6:

				break;
			}
		}

	}

	static void printMenu() {
		System.out.println("1. List all employees");// displayAllEmployees()
		System.out.println("2. Display yearly salary");// calculateYearlySalary()
		System.out.println("3. Display specific employee details");//findByEmployeeNumber()
		System.out.println("4. Modify the employee details");
		System.out.println("5. Delete an employee");
		//System.out.println("6. Exit");

	}
	static void printMenuDetails() {
		System.out.println("1. Update name");
		System.out.println("2. Update City");
		System.out.println("3. Update State");
		

	}
}
