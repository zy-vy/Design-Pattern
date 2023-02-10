package singleton;

public class Main {
	
	private void main() {
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Connection conn = Connection.getInstance();
				conn.setName("conn 1");
				System.out.println("connection name : "+ conn.getName());

			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Connection conn = Connection.getInstance();
				conn.setName("conn 2");
				System.out.println("connection name : "+ conn.getName());

			}
		});
		
		thread1.start();
		thread2.start();
		
		Connection conn = Connection.getInstance();
		conn.setName("conn 3");
		
		System.out.println("connection name : "+ conn.getName());
		
				
		
	}

	public static void main(String[] args) {
		System.out.println("hello");
		// TODO Auto-generated method stub
		Main main = new Main();
		main.main();
	}

}
