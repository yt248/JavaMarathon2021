package day13;

/*
Класс Task1:

В методе main() этого класса необходимо создать трех пользователей.
Затем необходимо:
Отправить 2 сообщения от пользователя 1 пользователю 2
Отправить 3 сообщения от пользователя 2 пользователю 1
Отправить 3 сообщения от пользователя 3 пользователю 1
Отправить 3 сообщения от пользователя 1 пользователю 3
Отправить 1 сообщение от пользователя 3 пользователю 1

Сообщения могут быть любыми.
После этого, необходимо вывести диалог пользователя 1 и пользователя 3 с помощью метода showDialog().

 */
public class Task1 {
    public static void main(String[] args) {


        User user1 = new User("User1");
        User user2 = new User("User2");
        User user3 = new User("User3");

        user1.sendMessage(user2, "Hi");
        user1.sendMessage(user2, "How are you?");
        user2.sendMessage(user1, "Hi! User1");
        user2.sendMessage(user1, "I`m fine");
        user2.sendMessage(user1, "How are you?");
        user3.sendMessage(user1, "Hi!");
        user1.sendMessage(user3, "Hello, I`m  Mr. " + user1.getUsername());
        user1.sendMessage(user3, "What`s you name?");
        user3.sendMessage(user1, "My name is " + user3.getUsername());
        user1.sendMessage(user3, "Nice to meet you!");
        user3.sendMessage(user1, "You too!");

        MessageDatabase.showDialog(user3, user1);

    }
}
