import java.util.Arrays;

public class StringArrayManipulator {
    private String[] stringArray;

    public StringArrayManipulator(String[] stringArray) {
        this.stringArray = stringArray;
    }

    public void printArray() {
        System.out.println(Arrays.toString(stringArray));
    }

    public void reverseStrings() {
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = new StringBuilder(stringArray[i]).reverse().toString();
        }
    }

    public int findLongestString() {
        int maxLength = 0;
        for (String str : stringArray) {
            if (str.length() > maxLength) {
                maxLength = str.length();
            }
        }
        return maxLength;
    }
}