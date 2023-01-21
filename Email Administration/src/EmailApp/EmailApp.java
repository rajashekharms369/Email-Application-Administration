package EmailApp;

public class EmailApp {
	public static void main(String[] args) {
		Email eml = new Email("Rajashekhar", "Sambalad");
		
		eml.setAlternateEmail("js@gmail.com");
		System.out.println("The alternate email adderss is "+eml.getAlternateEmail());
	}
}