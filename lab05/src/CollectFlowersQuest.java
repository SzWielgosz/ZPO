public class CollectFlowersQuest implements Observer {
    private Subject equipment;
    private String itemName;
    private int amountRequired = 5;

    public CollectFlowersQuest(Subject equipment) {
        this.itemName = "flower";
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
