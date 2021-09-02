package login.dao;

import login.model.User;

public class LoginDaoImp implements LoginDao {

	@Override
	public User create(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User readByUserIdAndPassWord(User user) {
		User userDa = null;
		if(user.getUserId() ==123456 && user.getPassWord().equals("secret"))
		{
			user.setUserName("hello");
		}
		if(user.getUserId() ==123123 && user.getPassWord().equals("happy32"))
		{
			user.setUserName("world");
		}
		return user;
	}

	@Override
	public User update(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User delete(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
