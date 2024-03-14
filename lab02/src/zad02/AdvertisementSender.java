package zad02;

public class AdvertisementSender {
    SendMethod sendMethod;


    public AdvertisementSender(SendMethod sendMethod) {
        this.sendMethod = sendMethod;
    }

    void doSendMessage(User user, Advertisement advertisement){
        user.getTranslation().translate();
        this.sendMethod.send(advertisement, user);
    }

    public void setSendMethod(SendMethod sendMethod) {
        this.sendMethod = sendMethod;
    }

}
