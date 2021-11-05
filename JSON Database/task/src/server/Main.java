package server;

import client.request.RequestModifier;
import client.request.StatusGetter;
import server.array.ArrayController;
import server.request.ClientDataAnalyzer;
import server.request.RequestAnalyzer;

public class Main {

    public static void main(String[] args) {
        ArrayController arrayController = new ArrayController();
        ClientDataAnalyzer clientDataAnalyzer = new ClientDataAnalyzer();
        RequestAnalyzer requestAnalyzer = new RequestAnalyzer();
        RequestModifier requestModifier = new RequestModifier();
        StatusGetter statusGetter = new StatusGetter();
        String[] database = arrayController.createArray();
        String request ="";

        while(!request.equals("exit")){
            request = statusGetter.getUserRequest();
            String[] requestA = requestModifier.getModifiedRequest(request);
            database = requestAnalyzer.analyzeRequest(database,requestA);
        }
    }
}
