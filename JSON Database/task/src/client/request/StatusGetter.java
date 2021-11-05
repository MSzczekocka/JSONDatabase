package client.request;

import java.util.Scanner;

public class StatusGetter {

    public String getUserRequest() {
        RequestAnalyzer requestAnalyzer = new RequestAnalyzer();
        String request = "";
        Scanner scanner = new Scanner(System.in);

        while (request.equals("")){
            System.out.print("> ");
            request = scanner.nextLine();
            String result = requestAnalyzer.checkRequest(request);
            if(!result.equals("OK")){
                System.out.println(result);
                request = "";
            }
        }
        return request;
    }
}
