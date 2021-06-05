
public class Employee {

	private transient String empName;
	private double salary;
	private int empNo;
	//private Address address;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	/**
	 * @return the monthlySalary
	 */

	public double getSalary() {
		return salary;
	}

	/**
	 * @param monthlySalary the monthlySalary to set
	 */

	public void setSalary(double salary) {
		this.salary = salary;
	}

	/**
	 * @return the age
	 */
	public int getEmpNo() {
		return empNo;
	}

	/**
	 * @param age the age to set
	 */
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	
	public Employee(int empNo, String empName, int salary) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.salary = salary;
		//this.city = city;
		//this.state = state;
	}
	
	public Employee(Employee employee) {
		
		this.empNo = employee.empNo;
		this.empName = employee.empName;
	}
	
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + "]";
	}
}
