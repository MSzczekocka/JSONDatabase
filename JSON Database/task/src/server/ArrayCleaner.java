package server;

public class ArrayCleaner {
    protected String[] deleteCellInArray(String[] arr, int position){
        arr[position] = "";
        return arr;
    }
}
