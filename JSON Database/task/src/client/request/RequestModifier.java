package client.request;

public class RequestModifier {
    public String[] getModifiedRequest(String request) {
        String[] result;
        if (request.contains("set")){
            result = new String[]{"set", "", ""};
            result[1] = request.substring(4,find2ndSpace(request)-1);
            result[2] = request.substring(find2ndSpace(request));
        }else{
           result = request.split(" ");
        }
       return result;
    }

    private static int find2ndSpace(String request){
        int result = 0, space = 0;
        while (space<=1) {
            if (request.charAt(result) == ' ') {
                space++;
            }
            result++;
        }
        return result;
    }


}
