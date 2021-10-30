import org.junit.Assert;
import org.junit.Test;
import server.array.ArrayController;

public class ArrayControllerTest {

    @Test
    public void createArray_size(){
        //given
        ArrayController arrayController = new ArrayController();
        //when
        String[] arr = arrayController.createArray();
        //then
        Assert.assertEquals(100,arr.length);
    }

    @Test
    public void createArray_value(){
        //given
        ArrayController arrayController = new ArrayController();
        //when
        String[] arr = arrayController.createArray();
        //then
        Assert.assertEquals("",arr[65]);
    }
}
