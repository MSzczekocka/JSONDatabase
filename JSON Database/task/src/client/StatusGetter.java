package client;

import java.util.Scanner;

public class StatusGetter {

    public String getStatus(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
