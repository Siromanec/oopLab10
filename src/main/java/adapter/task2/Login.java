package adapter.task2;

import java.time.LocalDate;

public class Login {
    public Client login(String loginMethod){
        if (loginMethod.equals("twitter")) {
            return new TwitterClient(new TwitterUser("a@mail.com", "Ukraine","2022"));
        } else if (loginMethod.equals("facebook")) {
            return new FacebookClient(new FacebookUser("a@mail.com", Country.Ukraine, LocalDate.now()));
        }
//        else {
//        throw new IllegalAccessException("No such login method");
//        }
        return null;
    }
}
