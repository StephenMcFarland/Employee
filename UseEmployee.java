//import org.apache.log4j.BasicConfigurator;
//import org.apache.log4j.Logger;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;

//import org.apache.log4j.BasicConfigurator;
//import org.apache.log4j.Logger;

import java.util.logging.Logger;


public class UseEmployee {
	
	private static final Logger LOGGER = Logger.getLogger(UseEmployee.class.getName());
	static Scanner s = new Scanner(System.in);
	static int selection = 0;
	public static EmployeeServiceImpl ES = new EmployeeServiceImpl();
	public static List<Employee> empList = new ArrayList<Employee>();
	public static void main(String[] args) {
		//
		//Configure logger
		//BasicConfigurator.configure();
		//logger.debug("Hello World!");
		
		Address a1 = new Address("Phoenix","Alaska");
		Address a2 = new Address("Billings","New Hampshire");
		Address a3 = new Address("Springfield","Kansas");
		Address a4 = new Address("Philly","Missouri");
		Address a5 = new Address("Qualitee","Florida");

		Employee e1 = new Employee(101, "Ginni", 15,a1.getEmpCity(),a1.getEmpState());
		Employee e2 = new Employee(102, "Jorge", 2,a2.getEmpCity(),a2.getEmpState());
		Employee e3 = new Employee(103, "Gack", 44,a3.getEmpCity(),a3.getEmpState());
		Employee e4 = new Employee(104, "Jared", 9,a4.getEmpCity(),a4.getEmpState());
		Employee e5 = new Employee(105, "Gessica", 52,a5.getEmpCity(),a5.getEmpState());

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
				Employee emp = ES.findByEmployeeNumber(empList, s.nextInt());
				System.out.println(emp.toString());
				printMenu();
				break;
			case 4:
				System.out.println("Enter employee number 101-105: ");
				int empNo =-1;
				try {
					empNo = s.nextInt();
					
					}catch(InputMismatchException e) {
						//String str = s.nextLine();
						System.out.println("You didn't enter a number.");
					}
				ES.findByEmployeeNumber(empList, empNo);
				
				printMenuDetails();
				selection = s.nextInt();
				switch(selection) {
				case 1:
				System.out.flush();
				System.out.println("Enter new employee name: ");
				ES.updateEmpName(empNo, s.next());
				printMenu();
				break;
				case 2:
					System.out.flush();
					System.out.println("Not implemented yet   Enter new employee City: ");
					//ES.updateEmpCity(en, s.next());
					printMenu();
					break;
				case 3:
					System.out.flush();
					System.out.println("Enter new employee State: ");
					printMenu();
				}
				break;
			case 5:
				//System.out.println("Enter employee number 1 greater than last employee: ");
				//int empNo = s.nextInt();
				System.out.println("Enter employee name: ");
				String ename = s.next();
				System.out.println("Enter years of experience: ");
				int yearsExp = s.nextInt();
				System.out.println("Enter employee City: ");
				String ecity = s.next();
				System.out.println("Enter employee State: ");
				String estate = s.next();
				ES.addEmployee(ename,yearsExp, ecity,estate);
				LOGGER.log(Level.INFO, "Employee successfully added.");
				printMenu();
				break;
			case 6:
				System.out.println("Enter employee number 101-105: ");
				ES.deleteEmployee(s.nextInt());
				LOGGER.log(Level.INFO, "Employee successfully deleted.");
				printMenu();
				break;
			case 7:
				ES.showStreams();
				printMenu();
				break;
			case 8:
				s.close();
				System.out.println("You have exited the system.");
				System.exit(0);
			}
		}

	}

	static void printMenu() {
		System.out.println("1. List all employees");// displayAllEmployees()
		System.out.println("2. Display yearly salary");// calculateYearlySalary()
		System.out.println("3. Display employee details by employee number");//findByEmployeeNumber()
		System.out.println("4. Modify the employee details");
		System.out.println("5. Add an employee");
		System.out.println("6. Delete an employee");
		System.out.println("7. Display Streams");
		System.out.println("8. Exit the system");

	}
	static void printMenuDetails() {
		System.out.println("1. Update name");
		System.out.println("2. Update City");
		System.out.println("3. Update State");
		

	}
}
