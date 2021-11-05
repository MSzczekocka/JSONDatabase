package client.request;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Stream;

public class RequestAnalyzer {
    public String checkRequest(String request) {
        if (!checkContent(request).equals("OK")) return checkContent(request);
        if (!checkDoubleRequest(request).equals("OK")) return checkDoubleRequest(request);
        if (!hasSpaces(request).equals("OK")) return hasSpaces(request);
        if (!hasValue(request).equals("OK")) return hasValue(request);
        if (!isValueValid(request).equals("OK")) return isValueValid(request);
        if(request.contains("set")){
            if (!hasString(request).equals("OK")) return hasString(request);
        }
        return "OK";
    }

    private static String checkContent(String request) {
        AtomicReference<String> result = new AtomicReference<>("Wrong content");
        String[] okRequests = {"exit", "set", "get", "delete"};
        Stream<String> stream = Arrays.stream(okRequests);
        stream.forEach(req -> {
            if (request.indexOf(req) == 0) {
                result.set("OK");
            }
        });
        return result.get();
    }

    private static String checkDoubleRequest(String request){
        String[] okRequests = {"exit", "set", "get", "delete"};
        int requests = 0;
        for (String okRequest: okRequests){
            if(request.contains(okRequest)){
                requests++;
            }
        }
        if (requests>1){
            return "More than one request";
        }
        return "OK";
    }

    private static String hasSpaces(String request) {
        if (request.contains(" ")) {
            return "OK";
        } else {
            return "Request do not have spaces";
        }
    }

    private static String hasValue(String request) {
        String[] result = request.split(" ");
        if (result.length < 2) {
            return "Request do not have value";
        } else {
            return "OK";
        }
    }

    private static String isValueValid(String request) {
        String[] result = request.split(" ");
        try {
            Double.parseDouble(result[1]);
        } catch (NumberFormatException e) {
            return "Request have not valid value";
        }
        return "OK";
    }

    private static String hasString(String request) {
        String[] result = request.split(" ");
        if (result.length < 3) {
            return "Set request do not have String";
        } else {
            return "OK";
        }
    }
}
