
import static org.junit.Assert.assertEquals;
import org.junit.Test; 


class EmployeeServiceImplTest {
	public EmployeeServiceImpl employeeServiceImpl;

	
	@Test
		public void testCalculateSalary() {
		   int salary = employeeServiceImpl.calculateSalary(1, 1000);
			assertEquals(1000, salary);
					
		}
		
	
		
	
	

	

	
	
}
