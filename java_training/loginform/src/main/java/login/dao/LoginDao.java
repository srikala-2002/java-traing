package login.dao;

import login.model.User;

public interface LoginDao {
	public abstract User create(User user);
	User readByUserIdAndPassWord(User user);
	public abstract User update(User user);
	public abstract User delete(int userId);

}
