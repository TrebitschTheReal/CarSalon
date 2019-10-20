package carSalon.service;

import carSalon.model.User;
import carSalon.repository.LoginRepository;

public class LoginService {
    LoginRepository lr;
    User user;

    public LoginService(User user) {
        this.lr = new LoginRepository();
        this.user = user;
        isFriendOrOutsider(user);
        user.setUserSecurityLevel(lr.getUserSecurityLevel());
    }

    private boolean isFriendOrOutsider(User user) {
        return lr.validateLoginQuery(user);
    }
}
