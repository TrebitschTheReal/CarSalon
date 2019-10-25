package carSalon.service;

import carSalon.model.User;
import carSalon.repository.LoginRepository;

public class LoginService {

    public LoginService(User user) {
        (new LoginRepository()).validateLoginQuery(user);
    }
}