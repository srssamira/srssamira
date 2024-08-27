public class ManipulationSlotMachine {

    private ContentSlotMachine[] slotMachine = ContentSlotMachine.values();
    private int difficulty;

    public ManipulationSlotMachine(ContentSlotMachine[] slotMachine, int difficulty) {
        this.slotMachine = slotMachine;
        this.difficulty = difficulty;
    }

    public void sortValues() {

        ContentSlotMachine[] sortSlotMachine = new ContentSlotMachine[3];

        int sumSortSlotMachine = 0;
        for (int index = 0; index < difficulty; index++) {
            for (int subIndex = 0; subIndex < slotMachine.length; subIndex++) {
                int random = (int) (Math.random() * slotMachine.length);
                sortSlotMachine[subIndex] = slotMachine[random];
                System.out.println(sortSlotMachine[subIndex].getName());
            }
            if (addBonus(sortSlotMachine, index) > 0) {
                sumSortSlotMachine = addBonus(sortSlotMachine, index);
            } else sumSortSlotMachine += sumScore(sortSlotMachine);
        }
        System.out.println(sumSortSlotMachine + " PONTOS");
    }

    public int sumScore(ContentSlotMachine[] slotMachine) {
        int sum = 0;
        for (int index = 0; index < slotMachine.length; index++) {
            sum += slotMachine[index].getScore();
        }
        return sum;
    }

    public int addBonus(ContentSlotMachine[] slotMachine, int index) {

        try {
            while (index < slotMachine.length) {
                for (int subIndex = index + 1; subIndex < slotMachine.length; subIndex++)
                    if (slotMachine[index].getName().equalsIgnoreCase(slotMachine[subIndex].getName())
                            && slotMachine[index + 1].getName().equalsIgnoreCase(slotMachine[subIndex + 1].getName())) {
                        return sumScore(slotMachine) * 100;
                    }
                index++;
            }
        } catch (Exception e) {
            System.out.println("---------------------");
        }
        return 0;
    }
}

