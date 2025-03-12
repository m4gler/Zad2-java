public class EmailProvider implements NotificationProvider {
    @Override
    public void send(String message, User user) {
        if(user.getIsEmailNotificationOn()) {

        }

    }
}
