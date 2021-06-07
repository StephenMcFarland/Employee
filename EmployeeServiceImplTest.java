
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;



class EmployeeServiceImplTest {
	private EmployeeServiceImpl employeeServiceImpl;
	//@BeforeEach
//	void initEach() {
//		employeeService = new EmployeeService();
//	}

	//@Nested
	//class AddTest {
		@SuppressWarnings("deprecation")
		@org.junit.Test
		void testCalculateSalary() {
			assertEquals(50000, employeeServiceImpl.calculateSalary(10, 40000));
					
		}
		
	
		
	
	

	

	
	
}
