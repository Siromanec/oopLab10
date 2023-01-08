package adapter.task2;

import java.time.LocalDate;

public class TwitterClient implements Client {
    private final TwitterUser user;
    public TwitterClient(TwitterUser user) {
        this.user = user;
    }

    @Override
    public String getEmail() {
        return user.getUserMail();
    }

    @Override
    public String getCountry() {
        return user.getCountry();
    }

    @Override
    public LocalDate getDate() {
        return LocalDate.parse(user.getLastActiveTime());
    }

    @Override
    public boolean send(String text) {
        return user.sendDM(text);
    }
}
