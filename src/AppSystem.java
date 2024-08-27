public class AppSystem {
    ContentSlotMachine[] slotMachine = ContentSlotMachine.values();
    IO io;

    public void initializeSystem(ContentSlotMachine[] slotMachine) {
        int difficulty = io.input("NÍVEL DE DIFICULDADE:" +
                "\n1 - FÁCIL ------------ (3 SLOTS)" +
                "\n2 - MÉDIO ------------ (6 SLOTS)" +
                "\n3 - DIFÍCIL ---------- (9 SLOTS)" +
                "\n4 - MUITO DIFÍCIL ---- (12 SLOTS)").nextInt();
        ManipulationSlotMachine manipulationSlotMachine = new ManipulationSlotMachine(slotMachine, difficulty);
        manipulationSlotMachine.sortValues();
    }
    
}
