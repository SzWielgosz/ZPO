package zad02;

public class Email implements SendMethod{
    @Override
    public void send(Advertisement advertisement, User user) {
        System.out.println("Sending via email: " + advertisement.getContent() + " to " + user.getName());
    }
}
