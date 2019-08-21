import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StairTest {


    @Test
    public void shouldCreateStair() {

        Stair stair = new Stair();
        String out = stair.stair(5);
        String expected =
                "    #\n" +
                "   ##\n" +
                "  ###\n" +
                " ####\n" +
                "#####\n";
        assertEquals(expected, out);
    }

}
