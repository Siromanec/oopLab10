package adapter.task2;

import java.time.LocalDate;

public class Login {
    public Client login(String loginMethod, String email) {
        if (loginMethod.equals("twitter")) {
            return new TwitterClient(new TwitterUser(email,
                    "Ukraine",
                    LocalDate.now().toString()));
        } else if (loginMethod.equals("facebook")) {
            return new FacebookClient(new FacebookUser(email,
                    Country.Ukraine,
                    LocalDate.now()));
        } else {
            throw new IllegalArgumentException("No such loginMethod");
        }
    }


}
