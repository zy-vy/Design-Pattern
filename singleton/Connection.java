package singleton;

public class Connection {

	private String name;
	
	private static Connection conn = null ;
	
	public String getName () {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	private Connection() {
		System.out.println("create new conn");
	}
	
	
	public static Connection getInstance() {
		if (conn == null ) {
			
			
			synchronized (Connection .class) {
				if (conn == null) {
					conn = new Connection();
				}
			}
		}
		
		
		System.out.println("get conn");
		
		return conn;
	}
	
}
