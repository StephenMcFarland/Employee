import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeServiceImpl implements EmployeeService {

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

	public double calculateSalary(int empNoYrExp, int baseSalary) {
		int yearlySalary = 0;

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

		
		return e;

	}

	public void addEmployee(String name, int yearsExp, String city, String state) {
		
		int eNo = UseEmployee.empList.size() + 101;

		Address a = new Address(city, state);

		Employee e = new Employee(eNo, name, yearsExp, a.getEmpCity(), a.getEmpState());

		UseEmployee.empList.add(e);
	}

	public void updateEmpName(int empNo, String name) {
	
		Employee e = findByEmployeeNumber(UseEmployee.empList, empNo);
		e.setEmpName(name);
		
	}

	public void updateEmpCity(int empNo, String city) {
		
		Employee e = findByEmployeeNumber(UseEmployee.empList, empNo);
		e.setEmpCity(city);
		
	}
	
	public void updateEmpState(int empNo, String state) {
		Employee e = findByEmployeeNumber(UseEmployee.empList, empNo);
		e.setEmpState(state);
	}
	
	public void deleteEmployee(int empNo) {
		
		Employee e;

		for (int i = 0; i < UseEmployee.empList.size(); i++) {

			e = UseEmployee.empList.get(i);
			if (e.getEmpNo() == empNo) {
				UseEmployee.empList.remove(i);
				System.out.flush();
				displayAllEmployees();
			}
		}
		
	}

	@Override
	public String showStreams() {
		
		System.out.println("Show Employee List using forEach: ");
		UseEmployee.empList.forEach(System.out::println);

		long empTotal = UseEmployee.empList.stream().count();
		System.out.println("\nShow Employee Count using stream count: " + empTotal);

		List<String> namesA = new ArrayList<>();
		for (Employee e : UseEmployee.empList) {
			namesA.add(e.getEmpName());
		}
		List<String> namesAresult = namesA.stream().filter(s -> s.contains("a")).collect(Collectors.toList());
		System.out.println("\nAny names that contain 'a' using filter: " + namesAresult);

		ListIterator<String> iterator = namesAresult.listIterator(namesAresult.size());

		System.out.print("\nNames containing 'a' in reverse order using ListIterator<> : ");
		
		while (iterator.hasPrevious()) {
			System.out.print(iterator.previous() + ", ");
		}
		System.out.println();

		List<String> names = Arrays.asList(UseEmployee.empList.get(0).getEmpName(),
				UseEmployee.empList.get(1).getEmpName(), UseEmployee.empList.get(2).getEmpName(),
				UseEmployee.empList.get(3).getEmpName(), UseEmployee.empList.get(4).getEmpName());

		List<String> result = names.stream().filter(s -> s.startsWith("G")).collect(Collectors.toList());
		System.out.println("\nNames that start with 'G' using filter and collect: " + result);

		List<String> resultA = namesA.stream().filter(s -> s.startsWith("G")).collect(Collectors.toList());
		System.out.println("\nNames that start with 'G' using enhanced for loop, filter, and collect: " + resultA + "\n");
		return null;
	}

}
