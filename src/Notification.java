import java.time.LocalDateTime;

public class Notification {
    private LocalDateTime createdAt;
    private String subject;
    private String body;

    protected String status;

    // constructor
    public Notification(String subject, String body) {
        this.subject = subject;
        this.body = body;
        this.createdAt = LocalDateTime.now();
        this.status = "default";
    }

    // getters
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    // methods
    public void transport() throws NoTransportException{
    }

    public void showStatus() {
        System.out.println(status);
    }

    protected void printSomeText() {
        System.out.println("This is the method that prints out some text.");
    }
}
