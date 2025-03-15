public class User {
    private String login;
    private String email;
    private String phoneNumber;
    private boolean isEmailNotificationsOn;
    private boolean isSMSNotificationsOn;

    public User(String login, String email, String phoneNumber, boolean isEmailNotificationsOn, boolean isSMSNotificationsOn) {
        this.login = login;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.isEmailNotificationsOn = isEmailNotificationsOn;
        this.isSMSNotificationsOn = isSMSNotificationsOn;
    }

    public boolean isSMSNotificationsOn() {
        return isSMSNotificationsOn;
    }

    public boolean isEmailNotificationsOn() {
        return isEmailNotificationsOn;
    }

    public String getEmail() {
        return email;
    }

    public String getLogin() {
        return login;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmailNotificationsOn(boolean isEmailNotificationsOn) {
        this.isEmailNotificationsOn = isEmailNotificationsOn;
    }

    public void setSMSNotificationsOn(boolean isSMSNotificationsOn) {
        this.isSMSNotificationsOn = isSMSNotificationsOn;
    }
}