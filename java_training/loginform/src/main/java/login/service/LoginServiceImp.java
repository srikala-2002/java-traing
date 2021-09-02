package login.service;

import login.model.User;
import com.login.dao.LoginDao;

public class LoginServiceImp implements LoginService {
	@Override
	public User create(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	
		// TODO Auto-generated method stub
		return null;
	}@Override
	public User readByUserIdAndPassWordService(User user) {
		User dumy = null;
		if(user!= null) {
		LoginDao logindao = new LoginImp();
		logindao.readByUserIdAndPassWordService(user);
		
		}
		return dumy;
	}

	@Override
	public User update(User user) {

	@Override
	public User delete(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
}
