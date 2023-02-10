package latihan10;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator {
	
	List<User> users;

	public ChatMediator() {
		// TODO Auto-generated constructor stub
		users = new ArrayList<>();
	}
	
	public void send(String message, User from , User to) {
//		if(from.isActive()&&to.isActive()) {
			if(users.contains(from)&&users.contains(to)) {
				System.out.println("msg = "+message);
				to.receiveMessege(message, from);
			}
//		}
	}
	
	public void register(User user) {
		if(!users.contains(user))
		users.add(user);
	}
	
	public void remove(User user) {
		users.remove(user);
	}

}
