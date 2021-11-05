package client;

import java.util.Scanner;

public class StatusGetter {

    public String getUserRequest() {
        String result = "";
        Scanner scanner = new Scanner(System.in);
        result = scanner.nextLine();

        while (result.equals("")){
            System.out.print("> ");
            result = scanner.nextLine();
        }
        return result;
    }
}
