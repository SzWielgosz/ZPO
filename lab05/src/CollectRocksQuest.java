public class CollectRocksQuest implements Observer {
    private Subject equipment;
    private String itemName;
    private int amountRequired = 5;

    public CollectRocksQuest(Subject equipment) {
        this.itemName = "rock";
        this.equipment = equipment;
        equipment.registerObserver(this);
    }

    @Override
    public void update(String name, int amount) {
        if (this.itemName.equals(name) && this.amountRequired == amount) {
            System.out.println(this.getClass().getName() + " completed");
            equipment.removeObserver(this);
        }
    }


}
