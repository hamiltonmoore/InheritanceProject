import java.time.LocalDateTime;

public class Notification {

    private LocalDateTime createdAt;
    private String subject;
    private String body;
    protected String status = default;

    public Notification(String body, String subject) {
        createdAt() = LocalDateTime.now()
    }

    public String getLocalDateTime() {
        return LocalDateTime;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    protected void printsometext() {
        System.out.println("some text");
    }

    public void transport() throws NoTransportException {

    }

    public void showStatus() {
        System.out.println(status);
    }
}
