import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiffInDaysTest {
    DiffInDays diffInDays;
    @Before
    public void before() {
        diffInDays = new DiffInDays();
    }

    @Test
    public void testSameMonthSameYear() {
        int diff = diffInDays.diff2(2011, 5, 1, 2011, 5, 9);
        assertEquals(8, diff);
    }

    @Test
    public void testDifferentMonthSameYear() {
        int diff = diffInDays.diff2(2011, 1, 1, 2011, 2, 9);
        assertEquals(39, diff);
    }

    @Test
    public void testDifferentMonthDiffYear() {
        int diff = diffInDays.diff2(2011, 1, 1, 2012, 2, 9);
        assertEquals(404, diff);
    }

    @Test
    public void testSameDates() {
        int diff = diffInDays.diff2(2011, 1, 1, 2011, 1, 1);
        assertEquals(0, diff);
    }



}