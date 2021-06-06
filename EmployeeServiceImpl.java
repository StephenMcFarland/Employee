import java.util.ArrayList;
import java.util.List;

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

	// Calculate the yearly salary of employee base $40K + $1K per yrs experience
	public double calculateYearlySalary(List<Employee> empList, int empNo) {
		double yearlySalary = 0;
		Employee e = findByEmployeeNumber(empList, empNo);

		yearlySalary = e.getSalary() * 1000 + 40000;

		return yearlySalary;

	}



	public Employee findByEmployeeNumber(List<Employee> empList, int empNo) {
		int i=0;
		Employee e = empList.get(i);
		
			//no validation here make sure input is 101-105
			
			while(e.getEmpNo() != empNo) {
				e = empList.get(i);
				i++;
			}
			

				//System.out.println(e.toString());
return e;
//			if(i>empList.size()) {
//				System.out.println("No such employee found.");
//			}
		}

	public void updateEmpName(int empNo, String name) {
		// TODO Auto-generated method stub
		Employee e = findByEmployeeNumber(UseEmployee.empList, empNo);
		e.setEmpName(name);
		//UseEmployee.empList.add(e);
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
				displayAllEmployees(UseEmployee.empList);

			}
			// return null;
		}

	}
}
