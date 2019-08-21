/**
 *
 * @author bforeste
 */
public class RomanNumerals {

	int [] pre = new int []{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
	String [] post = new String [] {"M", "CM", "D", "CD", };

	public String toRoman(int value) {
		return toRoman(new StringBuilder(), value);
	}

	public String toRoman(StringBuilder builder, int total) {
		String ret;
		if (total > 0) {
			if (total >= 1000) {
				builder.append("M");
				total = total - 1000;
			} else if (total >= 900) {
				builder.append("CM");
				total = total - 900;
			} else if (total >= 500) {
				builder.append("D");
				total = total - 500;
			} else if (total >= 400) {
				builder.append("CD");
				total = total - 400;
			} else if (total >= 100) {
				builder.append("C");
				total = total - 100;
			} else if (total >= 90) {
				builder.append("XC");
				total = total - 90;
			} else if (total >= 50) {
				builder.append("L");
				total = total - 50;
			} else if (total >= 40) {
				builder.append("XL");
				total = total - 40;
			} else if (total >= 10) {
				builder.append("X");
				total = total - 10;
			} else if (total >= 9) {
				builder.append("IX");
				total = total - 9;
			} else if (total >= 5) {
				builder.append("V");
				total = total - 5;
			} else if (total >= 4) {
				builder.append("IV");
				total = total - 4;
			} else if (total >= 1) {
				builder.append("I");
				total = total - 1;
			}
			ret = toRoman(builder, total);
		} else {
			ret = builder.toString();
		}

		return ret;
	}

}
