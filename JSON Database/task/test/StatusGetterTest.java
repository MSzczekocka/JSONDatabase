import client.request.StatusGetter;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class StatusGetterTest {
    @Test
    public void getUserRequestTest(){
        //given
        StatusGetter statusGetter = new StatusGetter();
        String request = "get 1";
        //when
        InputStream in = new ByteArrayInputStream(request.getBytes());
        System.setIn(in);
        String result = statusGetter.getUserRequest();
        //then
        Assert.assertEquals("get 1",result);
    }




}
