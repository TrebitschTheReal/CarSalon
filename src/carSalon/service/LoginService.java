package carSalon.service;
import carSalon.model.User;
import carSalon.repository.LoginRepository;

public class LoginService {

    private boolean isFriendOrOutsider(User user){
        LoginRepository lr = new LoginRepository();
        return lr.validateLoginQuery(user);
    }

    public boolean userLoggedin(User user){
        return isFriendOrOutsider(user);
    }
}
