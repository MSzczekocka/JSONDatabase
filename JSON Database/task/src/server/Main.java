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

        String request = statusGetter.getUserRequest();
        String[] requestA = requestModifier.getModifiedRequest(request);

        String[] database = arrayController.createArray();
        database = requestAnalyzer.analyzeRequest(database,requestA);
    }
}
