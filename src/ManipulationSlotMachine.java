import java.sql.Array;
import java.util.*;

public class ManipulationSlotMachine {

    private ContentSlotMachine[] slotMachine = ContentSlotMachine.values();

    public void sortValues() {
        ContentSlotMachine[] sortSlotMachine = ContentSlotMachine.values();

        for (int index = 0; index < 3; index++) {
            int random = (int) (Math.random() * 3);
            sortSlotMachine[index] = slotMachine[random];
            System.out.println(sortSlotMachine[index].getName());
        }
    }

    public void sumScore(ContentSlotMachine[] slotMachine) {
        int sum = 0;
        for (int index = 0; index < 3; index++) {
            sum = sum + slotMachine[index].getScore();
        }
        System.out.println(sum);
    }
}

