package connectionPool;

public class ConnectionFileReader {
	private String driver;
	private String connection;
	private String user;
	private String password; 
public 	ConnectionFileReader() {
	super();
}
 public ConnectionFileReader(String driver, String connection, String user, String password) {
	 super();
	 this.connection= connection;
	 this.driver= driver;
	 this.password=password;
	 this.user=user;
	 
 }
}
