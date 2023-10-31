package MidtermMaven;

import java.util.ResourceBundle;

public class sourceprog {
	public boolean verify(String in_user, String in_pwd)
	{
			ResourceBundle rb = ResourceBundle.getBundle("config");
			String userName = rb.getString("name");
			String userID = rb.getString("id");
			
			if (in_user.equals(userName) && in_pwd.equals(userID))
				return true;
			else
				return false;
		}

}