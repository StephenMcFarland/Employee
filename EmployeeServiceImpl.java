import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeServiceImpl implements EmployeeService {

	// static List<String> empList = new ArrayList<String>();

	/*
	 * empList.add("101 george smith 55000 phoenix alaska");
	 * empList.add("102 ginny smith 85000 holms texas");
	 * empList.add("103 gale smith 75000 springfield florida");
	 * empList.add("104 greg smith 65000 qualitee vermont");
	 */

	public void displayAllEmployees(List<Employee> empList) {
		empList.forEach(str -> System.out.println(str));

	}

	public void displayAllEmployees() {
		UseEmployee.empList.forEach(str -> System.out.println(str));

	}

	// Calculate the yearly salary of employee base $40K + $1K per yrs experience
	public double calculateYearlySalary(List<Employee> empList, int empNo) {
		double yearlySalary = 0;
		Employee e = findByEmployeeNumber(empList, empNo);

		yearlySalary = e.getYearsx() * 1000 + 40000;

		return yearlySalary;

	}

	public double calculateSalary(int empNoYrExp, double baseSalary) {
		double yearlySalary = 0;

		yearlySalary = empNoYrExp * 1000 + baseSalary;

		return yearlySalary;

	}

	public Employee findByEmployeeNumber(List<Employee> empList, int empNo) {
		int i = 0;
		Employee e = empList.get(i);

		// no validation here make sure input is 101-105

		while (e.getEmpNo() != empNo) {
			e = empList.get(i);
			i++;
		}

		// System.out.println(e.toString());
		return e;
//			if(i>empList.size()) {
//				System.out.println("No such employee found.");
//			}
	}

	public void addEmployee(String name, int yearsExp, String city, String state) {
		//
		int eNo = UseEmployee.empList.size() + 101;

		Address a6 = new Address(city, state);

		Employee e6 = new Employee(eNo, name, yearsExp, a6.getEmpCity(), a6.getEmpState());

		UseEmployee.empList.add(e6);
	}

	public void updateEmpName(int empNo, String name) {
		// TODO Auto-generated method stub
		Employee e = findByEmployeeNumber(UseEmployee.empList, empNo);
		e.setEmpName(name);
		// UseEmployee.empList.add(e);
	}

//	public void updateEmpCity(int empNo, String city) {
//		// TODO Auto-generated method stub
//		Employee e = findByEmployeeNumber(UseEmployee.empList, empNo);
//		e.setEmpName(city);
//		//UseEmployee.empList.add(e);
//	}
//	public void updateEmpState(int empNo, String state) {
//		// TODO Auto-generated method stub
//		Employee e = findByEmployeeNumber(UseEmployee.empList, empNo);
//		e.setEmpName(state);
//		//UseEmployee.empList.add(e);
//	}
	public void deleteEmployee(int empNo) {
		// TODO Auto-generated method stub
		Employee e;// = empList.get(emp);
		// List<Employee> tempList = new ArrayList<Employee>();

		for (int i = 0; i < UseEmployee.empList.size(); i++) {

			e = UseEmployee.empList.get(i);
			if (e.getEmpNo() == empNo) {
				UseEmployee.empList.remove(i);
				System.out.flush();
				displayAllEmployees();
			}
		}
		// return null;
	}

	@Override
	public String showStreams() {
		// memberNames.stream().filter((s) -> s.startsWith("A"))
		// .forEach(System.out::println);
		System.out.println("Show Employee List using forEach: ");
		UseEmployee.empList.forEach(System.out::println);

		long empTotal = UseEmployee.empList.stream().count();
		System.out.println("\nShow Employee Count using stream count: " + empTotal);

//		long empTotal = UseEmployee.empList.stream().count();
//		System.out.println("Show Employee Count: " + empTotal);

		List<String> namesA = new ArrayList<>();
				for(Employee e:UseEmployee.empList) {
					namesA.add(e.getEmpName());
				}
				List<String> namesAresult = namesA.stream().filter(s -> s.contains("a")).collect(Collectors.toList());   
		System.out.println("\nAny names that contain 'a' using filter: "+ namesAresult);

		

		 ListIterator<String> iterator = namesAresult.listIterator(namesAresult.size());

     
		 System.out.print("\nNames containing 'a' in reverse order using ListIterator<> : ");
		 //System.out.print("[");
     while (iterator.hasPrevious()) {
         System.out.print(iterator.previous()+", ");
     }
     System.out.println("");
	
	List<String> names = Arrays.asList(UseEmployee.empList.get(0).getEmpName(),
			UseEmployee.empList.get(1).getEmpName(), UseEmployee.empList.get(2).getEmpName(),
			UseEmployee.empList.get(3).getEmpName(), UseEmployee.empList.get(4).getEmpName());

	List<String> result = names.stream().filter(s -> s.startsWith("G")).collect(Collectors.toList());
	System.out.println("\nNames that start with 'G': " + result + "\n");
	
	
	return null;
	}
	
}
