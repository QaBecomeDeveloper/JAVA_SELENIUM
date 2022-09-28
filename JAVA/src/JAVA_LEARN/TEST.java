package JAVA_LEARN;

public class TEST {
	int rollno;//instance variable
	   String name;
	   static String college ="ITS";//static variable
	   //constructor
	   TEST(int r,String n){
	   rollno = r;
	   name = n;
	   }
	   //method to display the values
	   void display ()
	   {
		   System.out.println(rollno+" "+name+" "+college);
		   }
	
public static void main(String args[]){
	 TEST s1 = new TEST(111,"Karan");
	 TEST s2 = new TEST(222,"Aryan");
	 s1.display();
	 s2.display();
	 B b_obj= new B();
		b_obj.print_A();
		b_obj.print_B();
		
		C c_obj=new C();
		c_obj.print_A();
		c_obj.print_c();
	 }
}

	
