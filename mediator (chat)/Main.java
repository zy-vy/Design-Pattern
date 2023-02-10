package latihan10;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
		
		ChatMediator chatMediator = new ChatMediator();
		User a= new User("alex", chatMediator);
		User b= new User("bambang", chatMediator);
		User c= new User("cabe", chatMediator);
		User d= new User("domba", chatMediator);
		
		a.sendMessege("taik", b);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
