package server.request;

public class ClientDataAnalyzer {

    public boolean checkIndex(String[] request) {
        return Integer.parseInt(request[1]) <= 100 && Integer.parseInt(request[1]) >= 1;
    }

}
