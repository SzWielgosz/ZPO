import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Equipment implements Subject {

    Map<String, Integer> equipment = new HashMap<>();
    ArrayList<Observer> quests = new ArrayList<>();

    public void addItem(String name) {
        equipment.merge(name, 1, Integer::sum);
        notifyObservers(name, equipment.get(name));
    }

    @Override
    public void registerObserver(Observer observer) {
        quests.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        quests.remove(observer);
    }

    @Override
    public void notifyObservers(String name, int amount) {
        for (int i = 0; i < quests.size(); i++) {
            Observer quest = quests.get(i);
            quest.update(name, amount);
        }
    }
}
