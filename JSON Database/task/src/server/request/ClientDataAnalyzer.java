package server.request;

import java.util.Arrays;

public class ClientDataAnalyzer {
    public String[] getCommand(String input) {
        String[] info = input.split(" ");
        if (checkIndex(info[1]).equals("ERROR")) info[1] = "505";
        return info;
    }

    private static String checkIndex(String index) {
        if (Integer.getInteger(index) > 100 || Integer.getInteger(index) < 1) {
            return "ERROR";
        }
        return "OK";
    }
}
