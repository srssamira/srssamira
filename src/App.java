public class App {
    public static void main(String[] args) {

        ContentSlotMachine[] slotMachine = ContentSlotMachine.values();
        AppSystem appSystem = new AppSystem();

        appSystem.initializeSystem(slotMachine);
    }
}