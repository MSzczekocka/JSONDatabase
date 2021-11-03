import client.request.RequestModifier;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class RequestModifierTest {
    @Test
    public void getModifiedRequestTest(){
        //given
        RequestModifier requestModifier = new RequestModifier();
        String request = "get 45";
        String[] requestArray = {"get", "45"};
        //when
        String[] result = requestModifier.getModifiedRequest(request);
        //then
        Assert.assertArrayEquals(requestArray,result);
    }

    @Test
    public void getModifiedRequestSetTest(){
        //given
        RequestModifier requestModifier = new RequestModifier();
        String request = "set 87 Hello World";
        String[] requestArray = {"set", "87", "Hello World"};
        //when
        String[] result = requestModifier.getModifiedRequest(request);
        //then
        Assert.assertArrayEquals(requestArray,result);
    }

}
