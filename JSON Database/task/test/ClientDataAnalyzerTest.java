import org.junit.Assert;
import org.junit.Test;
import server.request.ClientDataAnalyzer;

public class ClientDataAnalyzerTest {
    @Test
    public void checkIndex_okTest(){
        //given
        ClientDataAnalyzer clientDataAnalyzer = new ClientDataAnalyzer();
        String[] request = {"set","45","HelloWorld"};
        //when
        boolean result = clientDataAnalyzer.checkIndex(request);
        //then
        Assert.assertTrue(result);
    }

    @Test
    public void checkIndex_nokTest(){
        //given
        ClientDataAnalyzer clientDataAnalyzer = new ClientDataAnalyzer();
        String[] request = {"set","44647","HelloWorld"};
        //when
        boolean result = clientDataAnalyzer.checkIndex(request);
        //then
        Assert.assertFalse(result);
    }
}
