package bot.main;

import bot.model.User;

import java.util.HashSet;
import java.util.Set;

public class HashSetUserRepository  {

    static HashSetUserRepository userRepository = new HashSetUserRepository();

    Set<User> users = new HashSet<>();

    //@Override
    public Boolean isUserExist(User user) {
        return users.contains(user);
    }

    //@Override
    public void addUser(User user) {
        users.add(user);
    }

    //@Override
    public User getUser(Long id) {
        return  new User(findUser(id));
    }

   // @Override
    public void updateUser(User user) {
        User storedUser = findUser(user.id);
        storedUser.history.addAll(user.history);
    }


    static public HashSetUserRepository returnUserRepository() {
        return userRepository;
    }

    private User findUser(Long id) {
        for (User user: users)
        {
            if(user.id.equals(id)){
                return user;
            }

        }
        throw new UserNotFoundException("User not found: " + id);
    }


}
