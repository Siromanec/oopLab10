package adapter.task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MessageSenderTest {
    MessageSender ms = new MessageSender();
    @BeforeEach
    void createMessageSender() {
    }

    @Test
    void send() {
        Login login = new Login();
        List<Client> clients = List.of(
                new FacebookClient(
                        new FacebookUser("f1@m.com",
                                Country.USA,
                                LocalDate.now())
                ),
                new FacebookClient(
                        new FacebookUser("f2@m.com",
                                Country.USA,
                                LocalDate.now())
                ),
                new FacebookClient(
                        new FacebookUser("f3@m.com",
                                Country.Ukraine,
                                LocalDate.of(2022, 12, 31))
                ),
                new FacebookClient(
                        new FacebookUser("f4@m.com",
                                Country.Ukraine,
                                LocalDate.now())
                ),
                login.login("twitter",
                        "f5@m.com"),
                new TwitterClient(new TwitterUser("t1@m.com",
                        "USA", LocalDate.now().toString())
                ),
                login.login("twitter",
                        "t2@m.com"),
                login.login("twitter",
                        "t3@m.com")



        );
        // messages should receive only users f4 f5 t2 t3
        List<Boolean> sent = ms.send("we want to contact you "
                        + "about your car's expired warranty",
                clients,
                "Ukraine");
        assertEquals(sent,
                List.of(false, false, false, false, true, false, true, true));

    }
}