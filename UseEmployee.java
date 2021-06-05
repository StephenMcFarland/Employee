

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UseEmployee {
	static Scanner s = new Scanner(System.in);
	static int selection = 0;
public static EmployeeServiceImpl ES = new EmployeeServiceImpl();

	public static void main(String[] args) {
		//
		List<String> empList = new ArrayList<String>();
		 empList.add("101 george smith 55000 phoenix alaska");
		 empList.add("102 ginny smith 85000 holms texas");
		 empList.add("103 gale smith 75000 springfield florida");
		 empList.add("104 greg smith 65000 qualitee vermont");
		 
		printMenu();
			while (s.hasNext()) {
		    	  if(s.hasNextInt()) {
		      selection = s.nextInt();
		      }
			
			switch (selection) {
			case 1:
//ES.displayAllEmployees();
empList.forEach(str -> System.out.println(str));
				break;
			case 2:

				break;
			case 3:
//ES.findByEmployeeNumber(102);
				int index = 0;
				if(empList.contains("104")) {
					index = empList.indexOf("104");
					 
				}
				//return (String)empList.get(index);
				System.out.println(empList.get(index));
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
