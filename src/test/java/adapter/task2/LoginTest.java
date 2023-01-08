package adapter.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class LoginTest {

    @Test
    void loginTest() {
        Login login = new Login();
        Client clientT = login.login("twitter", "novak@mail.com");

        Assertions.assertEquals(clientT.getEmail(), "novak@mail.com");
        Client clientF = login.login("facebook", "starak@mail.com");
        Assertions.assertEquals(clientF.getEmail(), "starak@mail.com");

    }
}