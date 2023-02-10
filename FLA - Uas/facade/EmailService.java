package facade;

import model.Email;

public class EmailService {
	
	Email email;
	
	public EmailService() {
		
	}
	
	public Email newEmailTemplate() {
		email = new Email("    Dear our customer,", "    ", "    Thank you.\nHotel Indah Bersari, Jalan Palmerah, Bali", "");
		return email;
	}
	
	public void sendEmail(String recipient) {
		System.out.println("Email : \n");
		System.out.println(email.getHeader());
		System.out.println(email.getBody());
		System.out.println(email.getFooter());
		System.out.println();
		if (!email.getAttachment().isEmpty()) {
			System.out.println("uploading attachment "+email.getAttachment()+"...");
		}
		System.out.println("SUCCESS sending email to "+recipient);
	}

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}

	
}
