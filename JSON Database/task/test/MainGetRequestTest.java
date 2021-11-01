import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class MainGetRequestTest {
    @Test
    public void getClientRequestTest(){
        //given
        client.StatusGetter statusGetter = new client.StatusGetter();
        String request = "get 1";
        //when
        InputStream in = new ByteArrayInputStream(request.getBytes());
        System.setIn(in);
        String result = statusGetter.getUserRequest();
        //then
        Assert.assertEquals(request,result);
    }
}
