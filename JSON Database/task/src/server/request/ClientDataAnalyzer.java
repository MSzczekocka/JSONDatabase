package server.request;

public class ClientDataAnalyzer {
    public String[] getCommand(String input) {
        String[] info;
        if(input.substring(0,3).equals("set")){
            info = new String[3];
            info[0] = input.substring(0,3);
            info[1] = input.substring(4,find2Space(input));
            info[2] = input.substring(find2Space(input)+1);
        }else{
            info = input.split(" ");
                if (!checkIndex(info[1])) {
                    info[1] = "505";
                }
        }
        return info;
    }

    private static int find2Space(String input){
        int space = 0, result = 0;
        for(int i=0; i< input.length();i++){
            if(input.charAt(i)==' '){
                space++;
                if(space==2){
                    return i;
                }
            }
        }
        return 0;
    }

    private static boolean checkIndex(String index) {
        return Integer.parseInt(index) <= 100 && Integer.parseInt(index) >= 1;
    }

}
