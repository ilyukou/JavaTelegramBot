package bot.model;

import java.util.Objects;

public class Message {
    Long id;
    String value;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return id.equals(message.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Message(Long id, String value) {
        this.id = id;
        this.value = value;
    }
}
