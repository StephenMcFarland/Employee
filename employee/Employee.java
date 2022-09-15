
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
	public String getEmpCity() {
		return empCity;
	}

	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}
	public String getEmpState() {
		return empState;
	}

	public void setEmpState(String empState) {
		this.empState = empState;
	}

	public double getYearsx() {
		return yearsx;
	}


	public void setYearsx(int yearsx) {
		this.yearsx = yearsx;
	}

	
	public int getEmpNo() {
		return empNo;
	}

	
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
