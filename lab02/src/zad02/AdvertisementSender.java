package zad02;

public class AdvertisementSender {
    SendMethod sendMethod;

    Translation translation;

    int money;

    private void chooseAdvertMethod(int money){
        if (money < 10) {
            this.sendMethod = new Email();
        } else if (money < 50) {
            this.sendMethod = new SMS();
        } else {
            this.sendMethod = new VoiceMessage();
        }
    }


    public AdvertisementSender(int money) {
        this.money = money;
        chooseAdvertMethod(money);
        this.translation = new PolishTranslation();
    }

    public void setMoney(int money) {
        this.money = money;
        this.chooseAdvertMethod(money);
    }

    public void checkTranslation(User user){
        if(user.getLanguage().equals("PL")){
            this.translation = new PolishTranslation();
        } else if (user.getLanguage().equals("EN")) {
            this.translation = new EnglishTranslation();
        }
    }

    void doSendMessage(User user, Advertisement advertisement){
        this.checkTranslation(user);
        this.translation.translate();
        this.sendMethod.send(advertisement, user);
    }
}
