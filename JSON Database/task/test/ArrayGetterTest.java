import org.junit.Assert;
import org.junit.Test;
import server.methods.ArrayGetter;

public class ArrayGetterTest {

    @Test
    public void getStringFromArray_okResult(){
        //given
        ArrayGetter arrayGetter = new ArrayGetter();
        String[] arr = {"X", "Y", "Z"};
        int position = 3;
        //when
        String result = arrayGetter.getStringFromArray(arr,position);
        //then
        Assert.assertEquals("Z",result);
    }

    @Test
    public void getStringFromArray_nokResult(){
        //given
        ArrayGetter arrayGetter = new ArrayGetter();
        String[] arr = {"X", "Y", "Z"};
        int position = 3;
        //when
        String result = arrayGetter.getStringFromArray(arr,position);
        //then
        Assert.assertNotEquals("X",result);
    }

    @Test
    public void getStringFromArray_emptyResult(){
        //given
        ArrayGetter arrayGetter = new ArrayGetter();
        String[] arr = {"X", "", "Z"};
        int position = 2;
        //when
        String result = arrayGetter.getStringFromArray(arr,position);
        //then
        Assert.assertEquals("ERROR",result);
    }


}
