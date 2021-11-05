package server.methods;

public class ArraySetter {
    public String[] setStringToArray(String[] arr, int position, String newString) {
        arr[position] = newString;
        return arr;
    }
}
