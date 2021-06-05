
public interface EmployeeService {
	public void displayAllEmployees();

	public double calculateYearlySalary(double salary);

	public String findByEmployeeNumber(int empNo);

	public String updateEmployee(int empNo);

	public String deleteEmployee(int empNo);
}
