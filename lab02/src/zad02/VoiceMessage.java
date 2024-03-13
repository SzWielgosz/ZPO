package zad02;

public class VoiceMessage implements SendMethod{
    @Override
    public void send(Advertisement advertisement, User user) {
        System.out.println("Sending via voice message: " + advertisement.getContent() + " to " + user.getName());
    }
}
