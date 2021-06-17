
public class Employee {

	private transient String empName;
	private transient String empCity;
	private transient String empState;
	private int yearsx;
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

	public double getYearsx() {
		return yearsx;
	}

	/**
	 * @param monthlySalary the monthlySalary to set
	 */

	public void setYearsx(double yearsx) {
		this.yearsx = yearsx;
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
	
	public Employee(int empNo, String empName, int yearsx, String empCity, String empState) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.yearsx = yearsx;
		this.empCity = empCity;
		this.empState = empState;
	}
	
	public Employee(Employee employee) {
		
		this.empNo = employee.empNo;
		this.empName = employee.empName;
	}
	
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + 
				", empCity=" + empCity + ", empState=" + empState +"]";
	}
}
