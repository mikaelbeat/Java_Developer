package newFeatures;

import java.util.ArrayList;
import java.util.function.Predicate;

public class UserLoginWeakPassword {

	public static void main(String[] args) {
		ArrayList<Login> userLogin = new ArrayList<Login>();
		userLogin.add(new Login("Cat","123"));
		userLogin.add(new Login("Dog","67890"));
		userLogin.add(new Login("Monkey","Mon"));
		
		Predicate<Login> predRules=(p)-> p.IsWeak()==true;
		
		// Lambda do
		System.out.println("");
		System.out.println("People with weak password.");
		userLogin.forEach((loginInfo)->
		{
			if(predRules.test(loginInfo)){
			System.out.println("User name: "+ loginInfo.UserName);
			System.out.println("Password: "+ loginInfo.Password);
			}
		});

	}

}
