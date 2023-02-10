package model;

public class GoldPost extends Post{
	
	private String specialGoldAttachment;

	public GoldPost(String title, String content, Theme theme, String picture, User user) {
		super(title, content, theme, picture, user);
		this.specialGoldAttachment = "\r\n" + 
				" ######    #######  ##       ########  \r\n" + 
				"##    ##  ##     ## ##       ##     ## \r\n" + 
				"##        ##     ## ##       ##     ## \r\n" + 
				"##   #### ##     ## ##       ##     ## \r\n" + 
				"##    ##  ##     ## ##       ##     ## \r\n" + 
				"##    ##  ##     ## ##       ##     ## \r\n" + 
				" ######    #######  ######## ########  \r\n" + 
				"";
		// TODO Auto-generated constructor stub
	}

	public String getSpecialGoldAttachment() {
		return specialGoldAttachment;
	}


	public GoldPost setSpecialGoldAttachment(String specialGoldAttachment) {
		this.specialGoldAttachment = specialGoldAttachment;
		return this;
	}

	public void print() {
		System.out.println(this.specialGoldAttachment);
		System.out.println("Title 	: "+this.getTitle());
		System.out.println("Content : "+this.getContent());
		System.out.println("Theme	: "+this.getTheme().getName());
		System.out.println("Picture : "+this.getPicture());
		System.out.println("Post by : "+this.getUser().getName());

	}

	
	

}
