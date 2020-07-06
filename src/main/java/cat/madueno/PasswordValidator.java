package cat.madueno;

public class PasswordValidator {
	
	private String pattern="^(?=.*[0-9])(?=.*[a-zA-Z]).{8,}$";
	private String password;
	
	public PasswordValidator(String password)
	{
		this.password=password;
	}
	
	public boolean validate()
	{				
		return password.matches(pattern);		
	}
}
