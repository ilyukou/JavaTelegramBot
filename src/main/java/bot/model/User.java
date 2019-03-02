package bot.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class User {
    public Long id;
    String firstName;
    String lastName;

    public Set<Message> history = new HashSet<>();

    public User(User user) {
        this.id = user.id;
        this.firstName = user.firstName;
        this.lastName =  user.lastName;

        // так потому что множество можно нечаянно изменить
        this.history = new HashSet<>(user.history);
    }
    // для новых user
    public User(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id.equals(user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
