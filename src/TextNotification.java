public class TextNotification {

    private String recipient;
    private String smsProvider;

    public EmailNotification(String recipient, String smsProvider, String body, String subject, String printsometext) {
        super(body, subject, printsometext);
        this.recipient = recipient;
        this.smsProvider = smsProvider;

    }
    public String getRecipient(){
        return recipient;
    }

    public String getSmsProvider() {
        return smsProvider;
    }

    public String getBody(){
        return body;
    }

    public String getSubject(){
        return subject;
    }

    @Override
    public void transport() throws NoTransportException {
        super.transport();
    }
}
