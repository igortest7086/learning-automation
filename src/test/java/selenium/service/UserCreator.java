package selenium.service;

import selenium.model.User;

public class UserCreator {

    public static final String USER_NAME = "Igor7086";
    public static final String USER_PASSWORD = "igor7086igor";

    public static User withCredentialsFromProperty() {
        return new User(USER_NAME, USER_PASSWORD);
    }

    public static User withEmptyUsername(){
        return new User("", USER_PASSWORD);
    }

    public static User withEmptyPassword(){
        return new User(USER_NAME, "");
    }

}
