package behavioral.mediator;

import java.util.LinkedList;
import java.util.List;

public class ChatRoom implements ChatMediator {

    private List<User> userList = new LinkedList<>();

    @Override
    public void sendMessage(String message, User sender) {
        for (User user: userList) {
            if (user != sender) {
                user.receiveMessage(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        userList.add(user);
    }
}
