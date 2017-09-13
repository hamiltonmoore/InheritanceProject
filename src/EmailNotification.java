import sun.rmi.transport.Transport;

public class EmailNotification extends Notification {

    private String recipient;
    private String smtpProvider;

    public EmailNotification(String recipient, String smtpProvider, String body, String subject) {
        super(body, subject);
        this.recipient = recipient;
        this.smtpProvider = smtpProvider;

    }
    public String getRecipient(){
        return recipient;
    }

    public String getSmtpProvider() {
        return smtpProvider;
    }

    public String getBody(){
        return body;
    }

    public String getSubject(){
        return subject;
    }

    public void setstatus(String status) {
        this.status = status;
    }

    @Override
    public void transport() throws NoTransportException {
        super.transport();
    }

    @Override
    protected String printsometext() {
        return super.printsometext();
    }
}
