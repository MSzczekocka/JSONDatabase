package server.array;

import java.util.Arrays;

public class ArrayController {

    public String[] createArray() {
        String[] database = new String[100];
        Arrays.fill(database, "");
        return database;
    }
}
