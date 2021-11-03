import org.junit.Assert;
import org.junit.Test;

public class ClientRequestAnalyzer {
    @Test
    public void wrongContentTest(){
        //given
        client.request.RequestAnalyzer requestAnalyzer = new client.request.RequestAnalyzer();
        String request = "XYZ";
        //when
        String result = requestAnalyzer.checkRequest(request);
        //then
        Assert.assertEquals("Wrong content",result);
    }

    @Test
    public void wrongContentGoodWordTest(){
        //given
        client.request.RequestAnalyzer requestAnalyzer = new client.request.RequestAnalyzer();
        String request = "get set delete 15";
        //when
        String result = requestAnalyzer.checkRequest(request);
        //then
        Assert.assertEquals("More than one request",result);
    }

    @Test
    public void noSpaceRequestTest(){
        //given
        client.request.RequestAnalyzer requestAnalyzer = new client.request.RequestAnalyzer();
        String request = "set44XYZ";
        //when
        String result = requestAnalyzer.checkRequest(request);
        //then
        Assert.assertEquals("Request do not have spaces",result);
    }

    @Test
    public void noValueRequestTest(){
        //given
        client.request.RequestAnalyzer requestAnalyzer = new client.request.RequestAnalyzer();
        String request = "get ";
        //when
        String result = requestAnalyzer.checkRequest(request);
        //then
        Assert.assertEquals("Request do not have value",result);
    }

    @Test
    public void wrongValueRequestTest(){
        //given
        client.request.RequestAnalyzer requestAnalyzer = new client.request.RequestAnalyzer();
        String request = "get xyz";
        //when
        String result = requestAnalyzer.checkRequest(request);
        //then
        Assert.assertEquals("Request have not valid value",result);
    }

    @Test
    public void noStringSetTest(){
        //given
        client.request.RequestAnalyzer requestAnalyzer = new client.request.RequestAnalyzer();
        String request = "set 12";
        //when
        String result = requestAnalyzer.checkRequest(request);
        //then
        Assert.assertEquals("Set request do not have String",result);
    }
}
