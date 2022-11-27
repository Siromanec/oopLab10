import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class User {
    private String email;
    private String name;
    private int age;
    public void save() {
        DBConnection dbConnection = DBConnection.getInstance();
        String query = "insert into user (email, name, age) values ('ss', 'ss', 13);";//String.format("insert into user (email, name, age) values ('ss', 'ss', 13);", email, name, age);
        dbConnection.executeQuery(query);
    }
}
