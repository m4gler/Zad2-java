import java.util.List;
import java.util.ArrayList;

public class NotificationService {
    private List<NotificationProvider> providers;

    public NotificationService() {
        this.providers = new ArrayList<>();
        providers.add(new EmailProvider());
        providers.add(new SMSProvider());
    }

    public void notify(String message, User user) {
        for (NotificationProvider provider : providers) {
            provider.send(message, user);
        }
    }
}