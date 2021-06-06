import java.util.List;

public interface EmployeeService {
	public void displayAllEmployees(List<Employee> empList);

	public double calculateYearlySalary(List<Employee> empList, int emp);

	public Employee findByEmployeeNumber(List<Employee> empList, int empNo);

	public String updateEmployee(int empNo);

	public void deleteEmployee(int empNo);
}
