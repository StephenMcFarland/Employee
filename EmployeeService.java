import java.util.List;

public interface EmployeeService {
	public void displayAllEmployees(List<Employee> empList);

	public double calculateYearlySalary(List<Employee> empList, int emp);

	public Employee findByEmployeeNumber(List<Employee> empList, int empNo);

	public void updateEmpName(int empNo, String name);

	public void deleteEmployee(int empNo);
}
