package qa.com.Hospital;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	Doctor drDoolittle = new Doctor("dr.doolittle", "surgeon", "", 50, 2);
    	Hospital h = new Hospital();
//    	addDoctor(drDoolittle) 
		for(int i=0; i<=2; i++) {
			h.addDoctor(drDoolittle);
			System.out.println(h.returnDoctors().get(i) + "/n");
			
    }
		
}
}
