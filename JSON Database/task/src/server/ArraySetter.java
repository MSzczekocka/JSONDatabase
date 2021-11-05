package server;

public class ArraySetter {
    protected String[] setStringToArray(String[] arr, int position, String newString) {
        arr[position] = newString;
        return arr;
    }
}
