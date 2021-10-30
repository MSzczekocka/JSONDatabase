package server.request;

import server.methods.ArrayCleaner;
import server.methods.ArrayGetter;
import server.methods.ArraySetter;

public class RequestAnalyzer {
    public String analyzeRequest(String[] database, String[] request) {
        ArrayCleaner arrayCleaner = new ArrayCleaner();
        ArrayGetter arrayGetter = new ArrayGetter();
        ArraySetter arraySetter = new ArraySetter();
        int position = Integer.getInteger(request[1]);
        if (position == 505) return "ERROR";

        switch (request[0]) {
            case "set":
                arraySetter.setStringToArray(database, position, request[2]);
                return "OK";
            case "get":
                arrayGetter.getStringFromArray(database, position);
                return "OK";
            case "delete":
                arrayCleaner.deleteCellInArray(database, position);
                return "OK";
            default:
                return "ERROR";
        }
    }
}
