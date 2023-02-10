package model;

public class Email {

	private String header;
	
	private String body;
	
	private String footer;
	
	private String attachment;

	public Email() {
		// TODO Auto-generated constructor stub
	}

	public Email(String header, String body, String footer, String attachment) {
		super();
		this.header = header;
		this.body = body;
		this.footer = footer;
		this.attachment = attachment;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getFooter() {
		return footer;
	}

	public void setFooter(String footer) {
		this.footer = footer;
	}

	public String getAttachment() {
		return attachment;
	}

	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}
	


}
