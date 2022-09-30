package module2;

import org.apache.commons.codec.binary.Base64;

public class Encode_Decode {
	public static String decode(String encodedPassword) {
		byte[] valueDecode = Base64.decodeBase64(encodedPassword);
        return new String(valueDecode);
		
	}
	
	public static void main(String[] args) {
		/*
		 * byte[] bytesEncoded = Base64.encodeBase64("Sushil123".getBytes());
		 * System.out.println("encoded value is " + new String(bytesEncoded));
		 * 
		 * byte[] valueDecode = Base64.decodeBase64(bytesEncoded);
		 * System.out.println("Decoded Value id " + new String(valueDecode));
		 */	
		 
		System.out.println(decode("U3VzaGlsMTIz"));
		 
		
				}

}
