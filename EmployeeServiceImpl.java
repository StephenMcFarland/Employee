import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
	
	static List<String> empList = new ArrayList<String>();
	
	
	/*
	 * empList.add("101 george smith 55000 phoenix alaska");
	 * empList.add("102 ginny smith 85000 holms texas");
	 * empList.add("103 gale smith 75000 springfield florida");
	 * empList.add("104 greg smith 65000 qualitee vermont");
	 */
	
	public void displayAllEmployees(){
		empList.forEach(str -> System.out.println(str));
		
		
	}
	 // Calculate the yearly salary of employee base $40K + $1K per yrs experience
	   public double calculateYearlySalary(Employee employee) {
	      double yearlySalary = 0;
	      yearlySalary = employee.getSalary() * 12;
	      return yearlySalary;
	   }
		
	   // Calculate the appraisal amount of employee
	   public double calculateAppraisal(Employee employee) {
	      double appraisal = 0;
			
	      if(employee.getSalary() < 10000){
	         appraisal = 500;
	      }else{
	         appraisal = 1000;
	      }
			
	      return appraisal;
	   }


	public String findByEmployeeNumber(int empNo) {
		//
		int index = 0;
		if(empList.contains(empNo)) {
			index = empList.indexOf(empNo);
			 
		}
		return (String)empList.get(index);
	}
	public String updateEmployee(int empNo) {
		// TODO Auto-generated method stub
		return null;
	}
	public String deleteEmployee(int empNo) {
		// TODO Auto-generated method stub
		return null;
	}
	public double calculateYearlySalary(double salary) {
		// TODO Auto-generated method stub
		return 0;
	}
}
