public class App {
    public static void main(String[] args) {

        ContentSlotMachine[] slotMachine = ContentSlotMachine.values();
        ManipulationSlotMachine manipulationSlotMachine = new ManipulationSlotMachine();

        manipulationSlotMachine.sortValues();
        manipulationSlotMachine.sumScore(slotMachine);
    }
}