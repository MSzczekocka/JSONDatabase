package server;

public class ArrayCleaner {
    protected String[] deleteCellInArray(String[] arr, int positon){
        arr[positon] = "";
        return arr;
    }
}
