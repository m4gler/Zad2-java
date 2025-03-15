public class Main {
    public static void main(String[] args) {
        User user1 = new User("us", "u@fdssdf.com", "12456785231", true, true);
        NotificationService notificationService = new NotificationService();

        notificationService.notify("Cześć", user1);
    }
}
