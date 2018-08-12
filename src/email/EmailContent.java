package email;

import java.util.Date;

public class EmailContent {
	
	private String to;
	private String cc;
	private String bcc;
	
	private String subject;
	
	private  String message;
	
	private Date creationDate;

	public EmailContent(String to, String subject, String message) {
		this.to = to;
		this.subject = subject;
		this.message = message;
		this.creationDate = new Date();
	}

	public EmailContent(String to, String cc, String subject, String message) {
		this(to, subject, message);
		this.cc = cc;
	}

	public EmailContent(String to, String cc, String bcc, String subject, String message) {
		this(to, cc, subject, message);
		this.bcc = bcc;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public String getBcc() {
		return bcc;
	}

	public void setBcc(String bcc) {
		this.bcc = bcc;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getCreationDate() {
		return creationDate;
	}
	
	

}
