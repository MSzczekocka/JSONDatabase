package server;

public class ArrayGetter {
    protected String getStringFromArray(String[] arr, int position){
        boolean isPositionEmpty = checkPosition(arr,position);
        if (isPositionEmpty) return "ERROR";
        return arr[position];
    }

    private static boolean checkPosition(String[] arr, int position){
        return arr[position].equals("");
    }
}