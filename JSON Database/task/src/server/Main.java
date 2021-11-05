package server;

import client.request.StatusGetter;
import server.array.ArrayController;
import server.request.ClientDataAnalyzer;
import server.request.RequestAnalyzer;

public class Main {

    public static void main(String[] args) {
        ArrayController arrayController = new ArrayController();
        ClientDataAnalyzer clientDataAnalyzer = new ClientDataAnalyzer();
        RequestAnalyzer requestAnalyzer = new RequestAnalyzer();
        StatusGetter statusGetter = new StatusGetter();

        String request = statusGetter.getUserRequest();
        String[] database = arrayController.createArray();

        String[] requestA = clientDataAnalyzer.getCommand(request);
        requestAnalyzer.analyzeRequest(database,requestA);
    }
}
