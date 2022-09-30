package Junit;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


//First step
@RunWith(Parameterized.class)
public class Parameterized_case {

	//Second step
	String firstname;
	String lastname;
	String password;
	int age;
	
	//third step
	public Parameterized_case(String firstname, String lastname, String password, int age ) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
		this.age = age;
		
	}
	// fourth step
	
	@Parameters
	public static Collection<Object[]> getData(){
		Object[][] data = new Object[2][4];
		
		//first row
		data[0][0]="thakur";
		data[0][1]="gabbar";
		data[0][2]="lala";
		data[0][3]="18";
		
		//second row
				data[1][0]="bashanti";
				data[1][1]="mausi";
				data[1][2]="veeru";
				data[1][3]="20";
				
				return Arrays.asList(data);
	}
	
	@Test
	public void doLogin() {
		System.out.println(firstname+" - "+lastname+" - "+password+" - "+age);
		
		
	}
}
