package email;

public class Main {
	
	public static void main(String[] args) {
		
		EmailSender es = new EmailSender();
		
		es.sendEmail(new EmailContent("ege@ege.com", "Slm kanki", "Napcaz aksam bea"));
		
	}
	
}
