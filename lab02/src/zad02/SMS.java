package zad02;

public class SMS implements SendMethod{
    @Override
    public void send(Advertisement advertisement, User user) {
        System.out.println("Sending via SMS: " + advertisement.getContent() + " to " + user.getName());
    }
}
