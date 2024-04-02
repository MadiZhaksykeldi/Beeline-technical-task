public class StringManipulationApp {
    public static void main(String[] args) {
        String[] newStringArray = {};
        StringArrayManipulator stringArrayManipulator = new StringArrayManipulator(newStringArray);
        stringArrayManipulator.addString("orange");
        stringArrayManipulator.addString("apple");
        stringArrayManipulator.addString("pineapple");
        System.out.print("Printing array: ");
        stringArrayManipulator.printArray();
        System.out.println("Longest string in array: " + stringArrayManipulator.findLongestString());
        stringArrayManipulator.reverseStrings();
        stringArrayManipulator.addString("banana");
        System.out.print("Printing array: ");
        stringArrayManipulator.printArray();
    }
}
