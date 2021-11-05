import org.junit.Assert;
import org.junit.Test;
import server.request.ClientDataAnalyzer;

public class ClientDataAnalyzerTest {
    @Test
    public void getCommand_setTest(){
        //given
        ClientDataAnalyzer clientDataAnalyzer = new ClientDataAnalyzer();
        String request = "set 1 HelloWorld!";
        //when
        String[] result = clientDataAnalyzer.getCommand(request);
        //then
        String[] expected = {"set","1","HelloWorld!"};
        Assert.assertArrayEquals(expected,result);
    }

    @Test
    public void getCommand_OutOfRangeSetTest(){
        //given
        ClientDataAnalyzer clientDataAnalyzer = new ClientDataAnalyzer();
        String request = "set 125 HelloWorld!";
        //when
        String[] result = clientDataAnalyzer.getCommand(request);
        //then
        String[] expected = {"set","505","HelloWorld!"};
        Assert.assertArrayEquals(expected,result);
    }

    @Test
    public void getCommand_getTest(){
        //given
        ClientDataAnalyzer clientDataAnalyzer = new ClientDataAnalyzer();
        String request = "get 57";
        //when
        String[] result = clientDataAnalyzer.getCommand(request);
        //then
        String[] expected = {"get","57"};
        Assert.assertArrayEquals(expected,result);
    }

    @Test
    public void getCommand_outOfRangeGetTest(){
        //given
        ClientDataAnalyzer clientDataAnalyzer = new ClientDataAnalyzer();
        String request = "get 189";
        //when
        String[] result = clientDataAnalyzer.getCommand(request);
        //then
        String[] expected = {"get","505"};
        Assert.assertArrayEquals(expected,result);
    }

    @Test
    public void getCommand_deleteTest(){
        //given
        ClientDataAnalyzer clientDataAnalyzer = new ClientDataAnalyzer();
        String request = "delete 100";
        //when
        String[] result = clientDataAnalyzer.getCommand(request);
        //then
        String[] expected = {"delete","100"};
        Assert.assertArrayEquals(expected,result);
    }

    @Test
    public void getCommand_outOfRangeDeleteTest(){
        //given
        ClientDataAnalyzer clientDataAnalyzer = new ClientDataAnalyzer();
        String request = "delete 505";
        //when
        String[] result = clientDataAnalyzer.getCommand(request);
        //then
        String[] expected = {"delete","505"};
        Assert.assertArrayEquals(expected,result);
    }
}
