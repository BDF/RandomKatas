import java.util.Arrays;

public class AddToArray {

    private final int base;
    private int [] arr;

    public AddToArray(int base, int[] arr) {
        this.base = base;
        this.arr = arr;
    }

    public int[] add(int numToAdd) {
        return add(numToAdd, arr.length - 1, arr);
    }

    private int[] add(int numToAdd, int pos, int [] currArr) {
        if (pos < 0 ) {
            int [] copy = new int [currArr.length + 1];
            for (int x = 0; x < currArr.length; x++) {
                copy[x + 1] = currArr[x];
            }
            currArr = copy;
            pos = 0;
        }

        if (currArr[pos] + numToAdd >= base) {
//            int newCarry = (currArr[pos] + numToAdd) - base + 1;
            int newValAtPos = (currArr[pos] + numToAdd) - base;
            currArr[pos] = newValAtPos;
            return add(1, pos - 1, currArr);
        } else {
            currArr[pos] = currArr[pos] + numToAdd;
        }

        return  currArr;
    }
}
