package latihan10;

public class User {
	
	private String name;
	private ChatMediator chatMediator;
	private boolean active;

	public User(String name,ChatMediator chatMediator) {
		// TODO Auto-generated constructor stub
		this.chatMediator = chatMediator;
		this.name=name;
		this.active= true;
		chatMediator.register(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ChatMediator getChatMediator() {
		return chatMediator;
	}

	public void setChatMediator(ChatMediator chatMediator) {
		this.chatMediator = chatMediator;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
		if(active)chatMediator.register(this);
		chatMediator.remove(this);
	}
	
	public void sendMessege(String m,User to) {
		System.out.println("user "+name + " send to "+to.getName());
		chatMediator.send(m, this, to);
	}
	
	public void receiveMessege(String m, User from) {
		System.out.println("user "+name + " received msg from "+ from.getName());
	}

}
