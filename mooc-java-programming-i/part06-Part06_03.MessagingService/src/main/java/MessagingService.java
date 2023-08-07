import java.util.ArrayList;
import java.util.Objects;

public class MessagingService {
    ArrayList<Message> message;

    public MessagingService() {
        this.message = new ArrayList<>();
    }

    public ArrayList<Message> getMessages() {
        return message;
    }
    
    public void add(Message message) {
        if (message.getContent().length() <= 280) {
            this.message.add(message);
        }
    }
    
    @Override
    public String toString() {
        return "MessagingService{" +
                "message=" + message +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MessagingService that = (MessagingService) o;
        return Objects.equals(getMessages(), that.getMessages());
    }
}