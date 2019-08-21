import java.util.Arrays;

public class Stair {

    public String stair(int stairDepth) {
        int numHashes = 1;

        char[] spaArr = new char[stairDepth];
        Arrays.fill(spaArr, ' ');

        char[] hshArr = new char[stairDepth];
        Arrays.fill(hshArr, '#');
        String spaces = new String(spaArr);
        String hashes = new String(hshArr);

        StringBuilder builder = new StringBuilder();
        while (numHashes <= spaces.length() ) {
            int numSpaces = spaces.length() - numHashes;
            builder.append(spaces, 0, numSpaces);
            builder.append(hashes.substring(numSpaces));
            builder.append("\n");
            numHashes++;
        }

        return builder.toString();
    }

}
