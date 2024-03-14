package zad02;

import java.util.ArrayList;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Andrzej", new PolishTranslation()));
        users.add(new User("John", new EnglishTranslation()));

        ArrayList<Advertisement> adverts = new ArrayList<>();
        adverts.add(new Advertisement("Buy stuff in biedronka"));
        adverts.add(new Advertisement("Buy stuff in lidl"));

        Random random = new Random();

        AdvertisementSender advertisementSender = new AdvertisementSender(new SMS());
        advertisementSender.doSendMessage(users.get(random.nextInt(users.size())), adverts.get(random.nextInt(adverts.size())));

        advertisementSender.setSendMethod(new VoiceMessage());
        advertisementSender.doSendMessage(users.get(random.nextInt(users.size())), adverts.get(random.nextInt(adverts.size())));
    }
}
