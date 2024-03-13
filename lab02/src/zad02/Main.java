package zad02;

import java.util.ArrayList;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Andrzej", "PL"));
        users.add(new User("John", "EN"));

        ArrayList<Advertisement> adverts = new ArrayList<>();
        adverts.add(new Advertisement("Buy stuff in biedronka"));
        adverts.add(new Advertisement("Buy stuff in lidl"));

        Random random = new Random();

        AdvertisementSender advertisementSender = new AdvertisementSender(50);
        advertisementSender.doSendMessage(users.get(random.nextInt(users.size())), adverts.get(random.nextInt(adverts.size())));

        advertisementSender.setMoney(9);
        advertisementSender.doSendMessage(users.get(random.nextInt(users.size())), adverts.get(random.nextInt(adverts.size())));
    }
}
