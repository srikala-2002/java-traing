package login.main;
import java.util.Scanner;
import java.util.scanner;

import login.model.User;

public class LoginApp {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("enter user id");
	int id= input.nextInt();
	System.out.println("enter password");
	String pwd= input.next();
	LoginService loginservice = new LoginServiceImp();
	User user = new user();
	user.setUserId(userId);
	user.setPassWord(passWord);
	User ans = loginService.readyByUserIdAndPasswordService(user);

	}

}
