import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;

import static org.junit.Assert.assertArrayEquals;

public class AddToArrayTest {
    private final int base = 10;

    @Test
    public void addingOneNoCarry() {
        AddToArray ata = new AddToArray(base, new int[]{1});
        int[] res = ata.add(1);
        assertArrayEquals(new int[]{2}, res);
    }


    @Test
    public void addingOneCarry() {
        AddToArray ata = new AddToArray(base, new int[]{9});
        int[] res = ata.add(1);
        assertArrayEquals(new int[]{1, 0}, res);
    }

    @Test
    public void addingOneCarryWith99() {
        AddToArray ata = new AddToArray(base, new int[]{9, 9});
        int[] res = ata.add(1);
        assertArrayEquals(new int[]{1, 0, 0}, res);
    }


    @Test
    public void adding5CarryWith99() {
        List<Integer> t = new ArrayList<>();
        t.add(0);
        t.add(9);
        AddToArray ata = new AddToArray(base, new int[]{9, 9});
        int[] res = ata.add(5);
        assertArrayEquals(new int[]{1, 0, 4}, res);
    }

}
