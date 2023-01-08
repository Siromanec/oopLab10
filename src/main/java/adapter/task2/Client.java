package adapter.task2;

import java.time.LocalDate;

public interface Client {
    String getEmail();
    String getCountry();
    LocalDate getDate();
    boolean send(String text);

}
