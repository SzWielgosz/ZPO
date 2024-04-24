public class Game {
    public static void main(String[] args) {
        Equipment equipment = new Equipment();
        CollectFlowersQuest collectFlowersQuest = new CollectFlowersQuest(equipment);
        CollectRocksQuest collectRocksQuest = new CollectRocksQuest(equipment);

        System.out.println(equipment.quests);

        equipment.addItem("flower");
        equipment.addItem("flower");
        equipment.addItem("flower");
        equipment.addItem("flower");
        equipment.addItem("flower");

        System.out.println(equipment.quests);

        equipment.addItem("rock");
        equipment.addItem("rock");
        equipment.addItem("rock");
        equipment.addItem("rock");
        equipment.addItem("rock");

        System.out.println(equipment.quests);
    }
}
