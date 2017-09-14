public class EmailNotification extends Notification {
    private String recipient;
    private String smtpProvider;

    public EmailNotification(String subject, String body, String recipient, String smtpProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smtpProvider = smtpProvider;
        this.status = "email";
        printSomeText();
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmtpProvider() {
        return smtpProvider;
    }

    @Override
    public void transport() {
        System.out.println(getRecipient() +"\n" + getSmtpProvider() +"\n" + getCreatedAt() +"\n" + getSubject() +"\n" + getBody());
    }

    @Override
    public void printSomeText() {
        super.printSomeText();
        System.out.println("THIS IS THE ADDITIONAL TEXT");
    }
}
