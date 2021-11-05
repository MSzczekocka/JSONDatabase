package server;

import java.util.Arrays;

public class ArrayCreator {

    protected String[] createArray() {
        String[] database = new String[100];
        Arrays.fill(database, "");
        return database;
    }
}
