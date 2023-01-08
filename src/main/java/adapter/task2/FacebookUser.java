package adapter.task2;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;



@Getter
@AllArgsConstructor
public class FacebookUser {
    private String email;
    private Country userCountry;
    private LocalDate getUserActiveTime;
    public String sendMessage(String text) {
        System.out.println("Sent to: " + email);
        System.out.println(text);
        return "Sent";
    };
}
