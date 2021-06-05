
public interface EmployeeService {
	public void displayAllEmployees();

	public double calculateYearlySalary(double salary);

	public void findByEmployeeNumber(int empNo);

	public String updateEmployee(int empNo);

	public String deleteEmployee(int empNo);
}
