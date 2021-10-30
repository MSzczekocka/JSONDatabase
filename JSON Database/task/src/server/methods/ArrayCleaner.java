package server.methods;

public class ArrayCleaner {
    public String[] deleteCellInArray(String[] arr, int position){
        arr[position] = "";
        return arr;
    }
}
