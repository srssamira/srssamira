import java.sql.Array;
import java.util.*;

public class ManipulationSlotMachine {

    private ContentSlotMachine[] slotMachine = ContentSlotMachine.values();

    public void sortValues() {

        for (int index = 0; index < 3; index++) {
            ContentSlotMachine[] sortSlotMachine = ContentSlotMachine.values();

            int random = (int) (Math.random() * 3);
            sortSlotMachine[index] = slotMachine[random];
            System.out.println(sortSlotMachine[index].getName());
        }

    }

}
