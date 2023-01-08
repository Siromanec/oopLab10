import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void save() {
        User user = new User("juan.juan@ucu.edu.ua", "juan", 19);
        user.save();
        // now you should run this in sqlite console: SELECT name FROM user;
        // and see that the user with name is present
    }
}