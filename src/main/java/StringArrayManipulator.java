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

    public void addString(String newString) {
        String[] copyOfStringArray = new String[stringArray.length + 1];
        System.arraycopy(stringArray, 0, copyOfStringArray, 0, stringArray.length);
        copyOfStringArray[copyOfStringArray.length - 1] = newString;
        stringArray = copyOfStringArray;
    }

    public String findLongestString() {
        String longestString = stringArray[0];
        for (int i = 1; i < stringArray.length; i++) {
            if (stringArray[i].compareTo(longestString) > 0) {
                longestString = stringArray[i];
            }
        }
        return longestString;
    }

    public String findShortestString() {
        String shortestString = stringArray[0];
        for (int i = 0; i < stringArray.length; i++) {
            if(stringArray[i].length() < shortestString.length()) {
                shortestString = stringArray[i];
            }
        }
        return shortestString;
    }
}