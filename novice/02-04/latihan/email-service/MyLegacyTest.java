

public class MyLegacyTest{
    public static void main(String[] args) {

		EmailService emailservice = new EmailService();
		emailservice.sendEmail("hai", "hai");

        MyApplication app = new MyApplication(emailservice);
		app.processMessages("Hi Pankaj", "pankaj@abc.com");
    }
}

class MyApplication {

	private EmailService email = null;

	public MyApplication(EmailService svc){
		this.email=svc;
	}

	public void processMessages(String msg, String rec){
		//do some msg validation, manipulation logic etc
		this.email.sendEmail(msg, rec);
	}
}

class EmailService{

	public void sendEmail(String message, String receiver){
		//logic to send email
		System.out.println("Email sent to "+receiver+ " with Message="+message);
	}
}