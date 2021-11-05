package server;

import client.StatusGetter;
import server.array.ArrayController;
import server.request.ClientDataAnalyzer;
import server.request.RequestAnalyzer;

public class Main {

    public static void main(String[] args) {
        ArrayController arrayController = new ArrayController();
        ClientDataAnalyzer clientDataAnalyzer = new ClientDataAnalyzer();
        RequestAnalyzer requestAnalyzer = new RequestAnalyzer();
        client.StatusGetter statusGetter = new StatusGetter();

        System.out.print("> ");
        String request = statusGetter.getUserRequest();
        String[] database = arrayController.createArray();

        String[] requestA = clientDataAnalyzer.getCommand(request);
        requestAnalyzer.analyzeRequest(database,requestA);
    }
}
