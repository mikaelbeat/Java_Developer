package newFeatures;

import java.util.ArrayList;
import java.util.Iterator;

import org.omg.Messaging.SyncScopeHelper;

public class UserLoginInfo {

	public static void main(String[] args) {
		ArrayList<Login> userLogin = new ArrayList<Login>();
		userLogin.add(new Login("Cat","12345"));
		userLogin.add(new Login("Dog","67890"));
		userLogin.add(new Login("Monkey","Monkey"));
		
	// For each
		System.out.println("Printing array using for each.");
		System.out.println("");
	for (Login login : userLogin){
		System.out.println("User name: "+login.UserName);
		System.out.println("Password: "+login.Password);
		System.out.println("-------------------------------------------");
	}
	
	// Iterator
	Iterator<Login> i = userLogin.iterator();
	System.out.println("");
	System.out.println("Printing array using Iterator.");
	while(i.hasNext()){
		Login login = i.next();
		System.out.println("User name: "+ login.UserName);
		System.out.println("Password: "+ login.Password);
	}
	
	// Lambda do
	System.out.println("");
	System.out.println("Printing array using Lambda.");
	userLogin.forEach((loginInfo)->
	{
		System.out.println("User name: "+ loginInfo.UserName);
		System.out.println("Password: "+ loginInfo.Password);
	});

}
}
