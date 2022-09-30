package MODULE1;

import java.sql.SQLException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

public class TEST {
		public static void main(String[] args)throws SQLException, ClassNotFoundException, AddressException, MessagingException {
			DbManager.setMysqlDbConnection();
			
			
		}

}
