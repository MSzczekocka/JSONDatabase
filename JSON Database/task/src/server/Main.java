package server;

import server.array.ArrayController;
import server.request.ClientDataAnalyzer;
import server.request.RequestAnalyzer;

public class Main {

    public static void main(String[] args) {
        ArrayController arrayController = new ArrayController();
        ClientDataAnalyzer clientDataAnalyzer = new ClientDataAnalyzer();
        RequestAnalyzer requestAnalyzer = new RequestAnalyzer();

        String[] database = arrayController.createArray();

        String[] request = clientDataAnalyzer.getCommand("get 4");
        requestAnalyzer.analyzeRequest(database,request);


    }
}
