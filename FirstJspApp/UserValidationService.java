package webapp;

public class UserValidationService {
	public Boolean isUserValid(String user,String password){
		
		if(user.equals("Nitesh") && password.equals("dummy"))
		return true;
		
		return false;
		
	}
}
