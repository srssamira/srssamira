public class AppSystem {
    ContentSlotMachine[] slotMachine = ContentSlotMachine.values();
    ManipulationSlotMachine manipulationSlotMachine = new ManipulationSlotMachine();
    IO io;

    public void playApp(ContentSlotMachine[] slotMachine) {
        int difficulty = io.input("Escolha uma dificuldade de 1 a 3: ").nextInt();
        manipulationSlotMachine.sortValues(difficulty);
    }
}
