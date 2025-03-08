package behavioral.mediator;

public class ChatUser extends User{

    public ChatUser(ChatMediator chatMediator, String name) {
        super(chatMediator, name);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(name + " send: " + message);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(name + " receive: " + message);
    }
}
