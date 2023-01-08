package adapter.task2;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class TwitterUser {
    private String userMail;
    private String country;
    private String lastActiveTime;
    public boolean sendDM(String text) {
        System.out.println("Sent to: " + userMail);
        System.out.println(text);
        return true;
    }
}
