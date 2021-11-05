package server.methods;

public class ArrayGetter {
    public String getStringFromArray(String[] arr, int position){
        boolean isPositionEmpty = checkPosition(arr,position);
        if (isPositionEmpty){
            return "ERROR";
        }
        return arr[position-1];
    }

    private static boolean checkPosition(String[] arr, int position){
        return arr[position-1].equals("");
    }
}