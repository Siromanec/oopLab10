package adapter.task2;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MessageSender {
    public List<Boolean> send(String text, List<Client> users, String country) {
        List<Boolean> sent = new ArrayList<>();
        for (Client user
                :users) {
            if (!user.getCountry().equals(country)) {
                sent.add(Boolean.FALSE);
                continue;
            }
            if (!user.getDate().equals(LocalDate.now())) {
                sent.add(Boolean.FALSE);
                continue;
            }
            sent.add(user.send(text));

        }
        return  sent;
    }
}
