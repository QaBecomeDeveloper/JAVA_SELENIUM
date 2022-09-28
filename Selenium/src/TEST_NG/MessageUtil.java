package TEST_NG;

public class MessageUtil {

	private String message;

	   //Constructor
	   //@param message to be printed
	   public MessageUtil(String message) {
	      this.message = message;
	   }

	   // prints the message
	   public String printMessage() {
	      System.out.println(message);
	      return message;
	   }
	   
	   // prints the message
	   public void printMessage1() {
	      System.out.println(message);
	      int a =0;
	      int b = 1/a;
	   }
	   
	      public String salutationMessage() {
	         message = "tutorialspoint" + message;
	         System.out.println(message);
	         return message;
	         
	      }
	      // add "Hi!" to the message
	      public String salutationMessage1() {
	         message = "Hi!" + message;
	         System.out.println(message);
	         return message;
	      }

	      // add "www." to the message
	      public String exitMessage() {
	         message = "www." + message;
	         System.out.println(message);
	         return message;
	         
	         
	      }
	   }

