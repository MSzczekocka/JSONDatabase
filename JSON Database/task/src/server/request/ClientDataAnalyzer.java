package server.request;

import java.util.Arrays;

public class ClientDataAnalyzer {
    public String[] getCommand(String input) {
        String[] info = input.split(" ");
        if (!checkIndex(info[1])) info[1] = "505";
        return info;
    }

    private static boolean checkIndex(String index) {
        return Integer.parseInt(index) <= 100 && Integer.parseInt(index) >= 1;
    }
}
