
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UseEmployee {
	static Scanner s = new Scanner(System.in);
	static int selection = 0;
	public static EmployeeServiceImpl ES = new EmployeeServiceImpl();

	public static void main(String[] args) {
		//
		List<Employee> empList = new ArrayList<Employee>();

		Employee e1 = new Employee(101, "Ginni", 55000);
		Employee e2 = new Employee(102, "George", 42000);
		Employee e3 = new Employee(103, "Gack", 84000);
		Employee e4 = new Employee(104, "Gared", 49000);
		Employee e5 = new Employee(105, "Gessica", 92000);

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
				System.out.println("Enter employee number 0-4: ");
				System.out.println(ES.calculateYearlySalary(empList,s.nextInt()));
				//ES.calculateYearlySalary(empList, s.nextInt());

				break;
			case 3:
				System.out.println("Enter employee number 0-4: ");
				ES.findByEmployeeNumber(empList, s.nextInt());
				
				break;
			case 4:

				break;
			case 5:

				break;
			case 6:

				break;
			}
		}

	}

	static void printMenu() {
		System.out.println("1. List all employees");// displayAllEmployees()
		System.out.println("2. Display yearly salary");// calculateYearlySalary()
		System.out.println("3. Display specific employee details");
		System.out.println("4. Modify the employee details");
		System.out.println("5. Delete an employee");
		System.out.println("6. Exit");

	}
}
