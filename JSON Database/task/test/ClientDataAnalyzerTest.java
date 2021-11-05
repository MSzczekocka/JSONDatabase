import org.junit.Assert;
import org.junit.Test;
import server.request.ClientDataAnalyzer;

public class ClientDataAnalyzerTest {
    @Test
    public void checkIndex_okTest(){
        //given
        ClientDataAnalyzer clientDataAnalyzer = new ClientDataAnalyzer();
        String[] request = {"set","45","Hi"};
        //when
        boolean result = clientDataAnalyzer.checkIndex(request);
        //then
        Assert.assertTrue(result);
    }

    @Test
    public void checkIndex_nokTest(){
        //given
        ClientDataAnalyzer clientDataAnalyzer = new ClientDataAnalyzer();
        String[] request = {"set","56783","Hi"};
        //when
        boolean result = clientDataAnalyzer.checkIndex(request);
        //then
        Assert.assertFalse(result);
    }

    @Test
    public void checkIndex_nok2Test(){
        //given
        ClientDataAnalyzer clientDataAnalyzer = new ClientDataAnalyzer();
        String[] request = {"set","-4","Hi"};
        //when
        boolean result = clientDataAnalyzer.checkIndex(request);
        //then
        Assert.assertFalse(result);
    }
}
