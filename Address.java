
public class Address {
	private String empCity;
	private String empState;
	
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
	
	public Address(String empCity, String empState) {
		super();
		this.empCity = empCity;
		this.empState = empState;
		
	}
	
	public Address(Address address) {
		
		this.empCity = address.empCity;
		this.empState = address.empState;
	}
	
	@Override
	public String toString() {
		return "Address [empCity=" + empCity + ", empState=" + empState + "]";
	}
}
