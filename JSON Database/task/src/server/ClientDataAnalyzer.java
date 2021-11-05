package server;

public class ClientDataAnalyzer {
    protected String getCommand(String input) {
        String command = input.substring(0, input.indexOf(' '));
        return command;
    }

    protected int getIndex(String input) {
        int index = Integer.getInteger(input.substring(input.indexOf(' ')));
        if (checkIndex(index).equals("ERROR")) return 505;
        return index;
    }

    private static String checkIndex(int index) {
        if (index > 100 || index < 1) {
            return "ERROR";
        }
        return "OK";
    }
}
