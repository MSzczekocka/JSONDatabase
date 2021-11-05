package server.methods;

public class ArraySetter {
    public String[] setStringToArray(String[] arr, int position, String newString) {
        arr[position-1] = newString;
        return arr;
    }
}
