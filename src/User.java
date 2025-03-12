public class User {
    private String login;
    private String email;
    private String isEmailNotificationOn;
    private String isSMSNotificationOn;

    public User(String login, String email, String isEmailNotificationOn, String isSMSNotificationOn) {
        this.login = login;
        this.email = email;
        this.isEmailNotificationOn = isEmailNotificationOn;
        this.isSMSNotificationOn = isSMSNotificationOn;
    }

    public String getIsSMSNotificationOn() {
        return isSMSNotificationOn;
    }

    public String getIsEmailNotificationOn() {
        return isEmailNotificationOn;
    }

    public String getEmail() {
        return email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIsEmailNotificationOn(String isEmailNotificationOn) {
        this.isEmailNotificationOn = isEmailNotificationOn;
    }

    public void setIsSMSNotificationOn(String isSMSNotificationOn) {
        this.isSMSNotificationOn = isSMSNotificationOn;
    }
}
