package adapter.task3;

public class Authentication extends Авторизація {
    public boolean authenticate(DataBase db) {
        db.getUserData();
        return true;
    }
}
