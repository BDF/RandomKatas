

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by bforeste on 7/14/15.
 *
 * @author bforeste
 */
public class RomanNumeralTest {

    private RomanNumerals rm = new RomanNumerals();

	/*
	1990 -> "MCMXC"  (1000 -> "M"  + 900 -> "CM" + 90 -> "XC")
2008 -> "MMVIII" (2000 -> "MM" + 8 -> "VIII")
  99 -> "XCIX"   (90 -> "XC" + 9 -> "IX")
  47 -> "XLVII"  (40 -> "XL" + 7 -> "VII")
	 */

    @Test
    public void shouldBeMCMXC() {
        assertEquals("IV", rm.toRoman(4));
        assertEquals("XL", rm.toRoman(40));

        assertEquals("IX", rm.toRoman(9));
        assertEquals("XC", rm.toRoman(90));

        assertEquals("XCIX", rm.toRoman(99));
        assertEquals("XLVII", rm.toRoman(47));
        assertEquals("IV", rm.toRoman(4));

        assertEquals("CD", rm.toRoman(400));
        assertEquals("CM", rm.toRoman(900));

        assertEquals("MCMXC", rm.toRoman(1990));
        assertEquals("MMVIII", rm.toRoman(2008));
        assertEquals("CMXCIX", rm.toRoman(999));

    }


}
