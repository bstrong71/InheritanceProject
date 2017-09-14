public class Main {
    public static void main(String[] args) {
        EmailNotification newEmail = new EmailNotification("Email subject line", "This is the email body", "Bernie", "Outlook");
        TextNotification newText = new TextNotification("Text subject line", "This is the text body", "Barbie", "Verizon");

        newEmail.transport();
        newText.transport();

        newEmail.showStatus();
        newText.showStatus();

        newEmail.printSomeText();

        Object emailNotificationClone = newEmail.clone();

        emailNotificationClone.equals(newEmail);
    }
}
