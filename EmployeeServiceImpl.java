import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
	
	//static List<String> empList = new ArrayList<String>();
	
	
	/*
	 * empList.add("101 george smith 55000 phoenix alaska");
	 * empList.add("102 ginny smith 85000 holms texas");
	 * empList.add("103 gale smith 75000 springfield florida");
	 * empList.add("104 greg smith 65000 qualitee vermont");
	 */
	
	public void displayAllEmployees(List<Employee> empList){
		empList.forEach(str -> System.out.println(str));
		
		
	}
	 // Calculate the yearly salary of employee base $40K + $1K per yrs experience
	   public double calculateYearlySalary(List<Employee> empList, int emp) {
	      double yearlySalary = 0;
	      Employee e = empList.get(emp);
	      //List<> tempList = new ArrayList<>();
	      yearlySalary = e.getSalary();
	      //Employee tempEmp.add(empList.get(emp));
	      System.out.println(yearlySalary);
	      yearlySalary = 2222.22;//tempEmp.getSalary();
	      
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


	public void findByEmployeeNumber(List<Employee> empList, int empNo) {
		//
		//int index = 0;
		List<Employee> tempList = new ArrayList<Employee>();
		
		//for(int i = 0;i<empList.size();i++) {
			//tempList.set(0,empList.get(2));
			
		//if(UseEmployee.e1.getEmpNo()==empNo) {
			//index = empList.indexOf(empNo);
			//System.out.println(empList.get(2));
			 
		//}
		//}
		//return (String)empList.get(index);
		
	}
	public String updateEmployee(int empNo) {
		// TODO Auto-generated method stub
		return null;
	}
	public String deleteEmployee(int empNo) {
		// TODO Auto-generated method stub
		return null;
	}

}
