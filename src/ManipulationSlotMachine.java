public class ManipulationSlotMachine {

    private ContentSlotMachine[] slotMachine = ContentSlotMachine.values();

    public void sortValues(int difficulty) {

        ContentSlotMachine[] sortSlotMachine = new ContentSlotMachine[3];

        int sumSortSlotMachine = 0;
        for (int index = 0; index < difficulty; index++) {
            for (int subIndex = 0; subIndex < slotMachine.length; subIndex++) {
                int random = (int) (Math.random() * slotMachine.length);
                sortSlotMachine[subIndex] = slotMachine[random];
                System.out.println(sortSlotMachine[subIndex].getName());
            }
            sumSortSlotMachine += sumScore(sortSlotMachine, difficulty);
        }
        System.out.println(sumSortSlotMachine + " PONTOS");
    }

    public int sumScore(ContentSlotMachine[] slotMachine, int difficulty) {
        int sum = 0;
        for (int index = 0; index < slotMachine.length; index++) {
            sum += slotMachine[index].getScore();
        }
        return sum;
    }

//    public int addBonus(ContentSlotMachine[] slotMachine, int difficulty) {
//        int sumAddBonus = 0;
//        if ((slotMachine[0].getName().equalsIgnoreCase(slotMachine[1].getName()))
//                && (slotMachine[1].getName().equalsIgnoreCase(slotMachine[2].getName()))) {
//            sumAddBonus = (sumScore(slotMachine, difficulty)) * 100;
//        }
//        return sumAddBonus;
//    }
}

