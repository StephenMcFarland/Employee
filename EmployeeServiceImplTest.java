
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;  
import com.javatpoint.logic.*;  
import org.junit.Test; 


class EmployeeServiceImplTest {
	public EmployeeServiceImpl employeeServiceImpl;

	@SuppressWarnings("deprecation")
	@Test
		public void testCalculateSalary() {
			assertEquals(1000, employeeServiceImpl.calculateSalary(1, 1000));
					
		}
		
	
		
	
	

	

	
	
}
