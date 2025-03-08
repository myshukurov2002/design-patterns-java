package behavioral.mediator;

public class Main {
    public static void main(String[] args) {

        ChatMediator chatRoom = new ChatRoom();

        User user1 = new ChatUser(chatRoom, "ali");
        User user2 = new ChatUser(chatRoom, "soli");
        User user3 = new ChatUser(chatRoom, "qozi");

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        user1.sendMessage("salom");
        user2.receiveMessage("salom");
    }
}
