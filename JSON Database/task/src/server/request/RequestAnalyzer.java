package server.request;

import server.methods.ArrayCleaner;
import server.methods.ArrayGetter;
import server.methods.ArraySetter;

public class RequestAnalyzer {
    public String[] analyzeRequest(String[] database, String[] request) {
        ClientDataAnalyzer clientDataAnalyzer = new ClientDataAnalyzer();
        ArrayCleaner arrayCleaner = new ArrayCleaner();
        ArrayGetter arrayGetter = new ArrayGetter();
        ArraySetter arraySetter = new ArraySetter();

        if(request[0].equals("exit")){
            return database;
        }
        int position = Integer.parseInt(request[1]);
        if (!clientDataAnalyzer.checkIndex(request)) {
            System.out.println("ERROR");
            return database;
        }

        switch (request[0]) {
            case "set":
                System.out.println("OK");
                return arraySetter.setStringToArray(database, position, request[2]);
            case "get":
                System.out.println(arrayGetter.getStringFromArray(database, position));
                return database;
            case "delete":
                System.out.println("OK");
                return arrayCleaner.deleteValueInArray(database, position);
            default:
                System.out.println("ERROR");
                return database;
        }
    }
}
