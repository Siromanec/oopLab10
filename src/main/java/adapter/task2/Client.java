package adapter.task2;

import java.time.LocalDate;

public interface Client {
    public String getEmail();
    public String getCountry();
    public LocalDate getDate();
    public boolean send(String text);

}
