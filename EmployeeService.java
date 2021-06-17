import java.util.List;

public interface EmployeeService {
	public void displayAllEmployees(List<Employee> empList);

	public double calculateYearlySalary(List<Employee> empList, int empNo);

	public Employee findByEmployeeNumber(List<Employee> empList, int empNo);

	public void updateEmpName(int empNo, String name);

	public void addEmployee(String name, int yearsExp, String City, String State);
	
	public void deleteEmployee(int empNo);
	
	public String showStreams();
}
