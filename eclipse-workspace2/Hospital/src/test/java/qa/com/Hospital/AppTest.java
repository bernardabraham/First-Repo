package qa.com.Hospital;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;



public class AppTest {
	private Hospital hos;
	Doctor drDoolittle = new Doctor("dr.doolittle", "surgeon", "", 50, 2);
//	Doctor drDoolittle = new Doctor("dr.doolittle", "surgeon", "", 50, 4);
//	Doctor drDoolittle = new Doctor("dr.doolittle", "surgeon", "", 50, 4);
	Patient pete = new Patient("pete", "15 chapel rd", 33, "face surgery","covered");
	
	@Before
	public void init() {
		this.hos = new Hospital();
		for(int i=0; i<=2; i++) {
			this.hos.addDoctor(drDoolittle);
		}
		
	}
	  @Test
		public void testAddDoctor() {
		assertTrue(this.hos.addDoctor(drDoolittle));
		assertTrue(this.hos.addDoctor(drDoolittle));
		assertTrue(this.hos.addDoctor(drDoolittle));
		//System.out.println(hos.returnDoctors());
	  }
	  
//	  @Test
//		public void testAddPatient() {
//		assertTrue(this.pat.addPatient(pete));
//		System.out.println(pat.returnPatients());
//	  }
    
    @Test
	public void testReturnDoctors() {
    	assertEquals(3, this.hos.returnDoctors().size());
    }
    
	@Test
	public void testReturnPatients() {
		hos.returnPatients().add(pete);

		assertEquals(1, this.hos.returnPatients().size());
	}
	
//	@Test
//	public void testReturnTeams() {
//		assertTrue(this.hos.addItem(new Book("Harry Potter", "J.K Rowling", 223, 3.99, false)));
//	}
//	@Test
//	public void testGradeCheck() {
//		assertEquals("success", true, this.hos.gradeCheck(grade);
//	}
//	@Test
//	public void TestConsultantTeamCheck() {
//		assertTrue(this.hos.addItem(new Book("Harry Potter", "J.K Rowling", 223, 3.99, false)));
//	}
}
	

