public class Main {

    public static void main(String[] args){

        EmailNotification emailNotification = new EmailNotification(transport(), setStatus());
        TextNotification textNotification = new TextNotification(transport(), setStatus());

    }
}
