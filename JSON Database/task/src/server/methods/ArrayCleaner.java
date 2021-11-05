package server.methods;

public class ArrayCleaner {
    public String[] deleteValueInArray(String[] arr, int position){
        arr[position-1] = "";
        return arr;
    }
}
