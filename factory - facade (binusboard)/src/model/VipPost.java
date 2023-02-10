package model;

public class VipPost extends Post{
	
	private String specialVipAttachment;

	public VipPost(String title, String content, Theme theme, String picture, User user) {
		super(title, content, theme, picture, user);
		this.specialVipAttachment = "\r\n" + 
				"##     ## #### ########  \r\n" + 
				"##     ##  ##  ##     ## \r\n" + 
				"##     ##  ##  ##     ## \r\n" + 
				"##     ##  ##  ########  \r\n" + 
				" ##   ##   ##  ##        \r\n" + 
				"  ## ##    ##  ##        \r\n" + 
				"   ###    #### ##        \r\n" + 
				"";
		
	}

	public String getSpecialVipAttachment() {
		return specialVipAttachment;
	}

	public VipPost setSpecialVipAttachment(String specialVipAttachment) {
		this.specialVipAttachment = specialVipAttachment;
		return this;
	}

	public void print() {
		System.out.println(this.specialVipAttachment);
		System.out.println("Title 	: "+this.getTitle());
		System.out.println("Content : "+this.getContent());
		System.out.println("Theme	: "+this.getTheme().getName());
		System.out.println("Picture : "+this.getPicture());
		System.out.println("Post by : "+this.getUser().getName());

	}
	

}
