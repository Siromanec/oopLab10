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
        String query = String.format("insert into user "
                + "(email, name, age) values ('%1$s', '%2$s', %3$d);",
                email, name, age);
        dbConnection.executeQuery(query);
    }
}
