package login.service;

import login.model.User;

public interface LoginService {
	public interface LoginDao {
		public abstract User create(User user);
		User readByUserIdAndPassWordService(User user);
		public abstract User update(User user);
		public abstract User delete(int userId);

	}

}
