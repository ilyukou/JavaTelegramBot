package bot.main;

import bot.jsonObject.Message;
import bot.jsonObject.getUpdates.Result;
import bot.jsonObject.getUpdates.TelegramResponse;
import bot.model.User;

import java.util.ArrayList;
import java.util.List;

public class UpdateHandler {
    UserRepository userRepository = new HashSetUserRepository();

    public void handle(TelegramResponse update){

        System.out.println(update.getResult().size());

        List<User> userList = extractUsersFromResponse(update);
        for(int i=0; i<userList.size(); i++){
            User user = userList.get(i);

            if(userRepository.isUserExist(user)){
                userRepository.updateUser(user);
            }else {
                userRepository.addUser(user);
            }
        }

    }

    private List<User> extractUsersFromResponse(TelegramResponse update) {
        List<User> userList = new ArrayList<>(); // временный списрк юзеров

        for(int i=0; i<update.getResult().size(); i++){

            Message message = update.getResult().get(i).getMessage();


            String textValue = message.getText();
            Long idMessage = message.getMessageId();
            bot.model.Message userMessage = new bot.model.Message(idMessage,textValue);

            Long idUser = message.getFrom().getId();


            User user = findUser(idUser,userList);
            if(user != null){
                user.history.add(userMessage);
            }else {
                String firstName = message.getFrom().getFirstName();
                String lastName = message.getFrom().getLastName();

                User newUser = new User(idUser,firstName,lastName);
                userList.add(newUser);
            }

        }
        return userList;
    }

    User findUser(Long id, List<User> list){
        for (User user: list)
        {
            if(user.id.equals(id)){
                return user;
            }

        }
        return null;

    }
}
