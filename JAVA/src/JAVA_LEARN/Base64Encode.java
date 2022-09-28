package JAVA_LEARN;

import java.util.Base64;

public class Base64Encode {
	public void Encode(){
	    String str = "12345";
	    String b64 = Base64.getEncoder().encodeToString(str.getBytes());
	    System.out.println(b64);
	  }
	
	public void Decode(){
	    String b64 = "MTIzNDU=";
	    byte[] decoder = Base64.getDecoder().decode(b64);
	    String str = new String(decoder);
	    System.out.println(str);
	  }


public static void main(String[] args) {
	Base64Encode obj = new Base64Encode();
    obj.Encode();
    obj.Decode();
}
}
