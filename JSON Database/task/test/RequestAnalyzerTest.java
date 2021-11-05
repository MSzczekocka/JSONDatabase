import org.junit.Assert;
import org.junit.Test;
import server.request.RequestAnalyzer;

import java.util.Random;


public class RequestAnalyzerTest {

    @Test
    public void analyzeRequest_outOfRangeRequestTest(){
        //given
        RequestAnalyzer requestAnalyzer = new RequestAnalyzer();
        String[] testDatabase = createTestDatabase();
        String[] request = {"set", "505", "X"};
        //when
        String[] result = requestAnalyzer.analyzeRequest(testDatabase,request);
        //then
        Assert.assertArrayEquals(testDatabase,result);
    }

    @Test
    public void analyzeRequest_ValueSetRequestTest(){
        //given
        RequestAnalyzer requestAnalyzer = new RequestAnalyzer();
        String[] testDatabase = createTestDatabase();
        String[] request = {"set", "15", "A"};
        //when
        String[] result = requestAnalyzer.analyzeRequest(testDatabase,request);
        //then
        Assert.assertEquals("A",result[14]);
    }

    @Test
    public void analyzeRequest_GetRequestTest(){
        //given
        RequestAnalyzer requestAnalyzer = new RequestAnalyzer();
        String[] testDatabase = createTestDatabase();
        String[] request = {"get", "15"};
        //when
        String[] result = requestAnalyzer.analyzeRequest(testDatabase,request);
        //then
        Assert.assertArrayEquals(testDatabase,result);
    }

    @Test
    public void analyzeRequest_DeleteRequestTest(){
        //given
        RequestAnalyzer requestAnalyzer = new RequestAnalyzer();
        String[] testDatabase = createTestDatabase();
        String[] request = {"delete", "68"};
        //when
        String[] result = requestAnalyzer.analyzeRequest(testDatabase,request);
        //then
        Assert.assertEquals("",result[67]);
    }

    @Test
    public void analyzeRequest_ExitTest(){
        //given
        RequestAnalyzer requestAnalyzer = new RequestAnalyzer();
        String[] testDatabase = createTestDatabase();
        String[] request = {"exit"};
        //when
        String[] result = requestAnalyzer.analyzeRequest(testDatabase,request);
        //then
        Assert.assertArrayEquals(testDatabase,result);
    }

    private static String[] createTestDatabase(){
        String[] testDatabase = new String[100];
        Random rd = new Random();
        for (int i = 0; i < testDatabase.length; i++) {
            testDatabase[i] = Integer.toString(rd.nextInt());
        }
        return testDatabase;
    }

}
