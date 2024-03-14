package zad02;

public class AdvertisementSender {
    SendMethod sendMethod;

    Translation translation;


    public AdvertisementSender(SendMethod sendMethod) {
        this.sendMethod = sendMethod;
        this.translation = new PolishTranslation();
    }

    public void checkTranslation(User user){
        this.translation = user.getTranslation();
    }

    void doSendMessage(User user, Advertisement advertisement){
        this.checkTranslation(user);
        this.translation.translate();
        this.sendMethod.send(advertisement, user);
    }

    public void setSendMethod(SendMethod sendMethod) {
        this.sendMethod = sendMethod;
    }

}
