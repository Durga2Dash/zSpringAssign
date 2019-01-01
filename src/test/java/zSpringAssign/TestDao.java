package zSpringAssign;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.mindtree.dao.EmployeeDao;
import com.mindtree.entity.Employee;
import com.mindtree.serviceImpl.EmployeeServiceImpl;

public class TestDao {

	EmployeeServiceImpl es;
	EmployeeDao ed; 
	Employee e;
	
	@Before
	public void setup()
	{
		ed = mock(EmployeeDao.class);
		es = new EmployeeServiceImpl(ed);
		e = new Employee();
		e = es.getEmployeeByName("Srini");
	}
	
	static Employee ll = new Employee();
	@Test
	public void testClass()
	{
		when(ed.getEmployeeByName("Srini")).thenReturn(getEmployees());
		assertEquals("Male",ed.getEmployeeByName("Srini").getGender());
		assertEquals("cutesrini@abc.com",es.getEmployeeByName("Srini").getEmailid());
		
		verify(ed).getEmployeeByName("Srini");
	}
	
	public static Employee getEmployees()
	{
		
		ll.setName("Srini");
		ll.setPassword("Srini123");
		ll.setFullName("Srinivas");
		ll.setDob("16-16-2018");
		ll.setEmailid("cutesrini@abc.com");
		ll.setGender("Male");
		ll.setSecurityQuestion("What the ?");
		ll.setSecurityAnswer("wert");
		return ll;
	}
}
