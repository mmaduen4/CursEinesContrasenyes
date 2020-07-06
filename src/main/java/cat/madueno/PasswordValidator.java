package cat.madueno;

public class PasswordValidator {
	
	
	/**
	 *  Les contrasenyes han de tenir 10 caràcters com a mínim, almenys dos números 
	 *  i hi ha d’haver lletres en majúscules i en minúscules.
	 *  Falta la última condició de l'exercici 
	 *  (almenys un símbol que no pot estar ni al principi ni al final). 
	 */
	private String pattern="^(?=(.*\\d){2})(?=.*[a-z])(?=.*[A-Z]).{10,}$";
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
