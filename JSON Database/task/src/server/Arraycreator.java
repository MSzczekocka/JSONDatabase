package server;

import java.util.Arrays;

public class Arraycreator {

    public String[] createArray() {
        String[] database = new String[100];
        Arrays.fill(database, "");
        return database;
    }
}
